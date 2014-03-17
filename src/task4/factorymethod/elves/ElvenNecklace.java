package task4.factorymethod.elves;

import task4.factorymethod.JewelryItem;
import task4.factorymethod.MainGemstone;
import task4.factorymethod.Metal;

public class ElvenNecklace extends JewelryItem {

	public ElvenNecklace() {
		super();
		setMetal(Metal.GOLD);
		setMainGemstone(MainGemstone.RUBY);
	}

}
