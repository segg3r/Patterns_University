package task4.factorymethod.elves;

import task4.factorymethod.JewelryItem;
import task4.factorymethod.MainGemstone;
import task4.factorymethod.Metal;

public class ElvenBrooch extends JewelryItem {

	public ElvenBrooch() {
		super();
		setMetal(Metal.GOLD);
		setMainGemstone(MainGemstone.EMERALD);
	}

}
