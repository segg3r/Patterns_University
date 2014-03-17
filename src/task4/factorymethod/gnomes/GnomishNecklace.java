package task4.factorymethod.gnomes;

import task4.factorymethod.AdditionalGemstone;
import task4.factorymethod.JewelryItem;
import task4.factorymethod.MainGemstone;
import task4.factorymethod.Metal;

public class GnomishNecklace extends JewelryItem {

	public GnomishNecklace() {
		super();
		setMetal(Metal.SILVER);
		setMainGemstone(MainGemstone.RUBY);
		addAdditionalGemstone(AdditionalGemstone.DIAMOND);
		addAdditionalGemstone(AdditionalGemstone.CUBIC_ZIRCONIA);
	}

}
