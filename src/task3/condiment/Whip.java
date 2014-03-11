package task3.condiment;

import task3.base.Beverage;
import task3.base.CondimentDecorator;

public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Whip";
	}

	@Override
	protected double getBigSizeCost() {
		return 0.40;
	}

	@Override
	protected double getMediumSizeCost() {
		return 0.40;
	}

	@Override
	protected double getSmallSizeCost() {
		return 0.40;
	}
}
