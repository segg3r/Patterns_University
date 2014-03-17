package task4.factorymethod.gnomes;

import task4.factorymethod.AdditionalGemstone;
import task4.factorymethod.JewelryItem;
import task4.factorymethod.MainGemstone;
import task4.factorymethod.Metal;

public class GnomishBrooch extends JewelryItem {

	public GnomishBrooch() {
		super();
		setMetal(Metal.SILVER);
		setMainGemstone(MainGemstone.EMERALD);
		addAdditionalGemstone(AdditionalGemstone.DIAMOND);
		addAdditionalGemstone(AdditionalGemstone.DIAMOND);
	}

}
