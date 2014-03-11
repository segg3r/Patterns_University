package task3.base;

public abstract class CondimentDecorator extends Beverage {
	protected Beverage beverage;

	public CondimentDecorator() {
		setSize(Size.MEDIUM);
	}

	public CondimentDecorator(Size size) {
		setSize(size);
	}

	public abstract String getDescription(); // в�?е декораторы
												// должны заново
												// реализовать
												// �?тот метод

	public double cost() {
		return getCostBySize() + beverage.cost();
	}

	public double getCostBySize() {
		switch (getSize()) {
		case BIG:
			return getBigSizeCost();
		case MEDIUM:
			return getMediumSizeCost();
		default:
			return getSmallSizeCost();
		}
	}

	protected abstract double getBigSizeCost();

	protected abstract double getMediumSizeCost();

	protected abstract double getSmallSizeCost();
}
