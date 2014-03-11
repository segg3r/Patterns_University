package task3.condiment;

import task3.base.Beverage;
import task3.base.CondimentDecorator;
import task3.base.Size;

public class Soy extends CondimentDecorator {
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public Soy(Size size, Beverage beverage) {
		super(size);
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Soy";
	}

	@Override
	protected double getBigSizeCost() {
		return 0.20;
	}

	@Override
	protected double getMediumSizeCost() {
		return 0.15;
	}

	@Override
	protected double getSmallSizeCost() {
		return 0.10;
	}
}
