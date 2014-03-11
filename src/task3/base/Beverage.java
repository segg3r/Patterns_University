package task3.base;

public abstract class Beverage {
	protected String description = "Unknown Beverage";
	private Size size;

	public String getDescription() {
		return description;
	}

	public abstract double cost();

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}
}
