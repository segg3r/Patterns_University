package task3;

import task3.base.Beverage;
import task3.base.Size;
import task3.beverage.DarckRoast;
import task3.beverage.Espresso;
import task3.beverage.HouseBlend;
import task3.condiment.Mocha;
import task3.condiment.Soy;
import task3.condiment.Whip;

public class StarbuzzCoffee {
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());

		Beverage beverage2 = new DarckRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out
				.println(beverage2.getDescription() + " $" + beverage2.cost());

		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(Size.SMALL, beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out
				.println(beverage3.getDescription() + " $" + beverage3.cost());
	}
}
