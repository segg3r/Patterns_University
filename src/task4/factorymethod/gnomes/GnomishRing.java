package task4.factorymethod.gnomes;

import task4.factorymethod.AdditionalGemstone;
import task4.factorymethod.JewelryItem;
import task4.factorymethod.MainGemstone;
import task4.factorymethod.Metal;

public class GnomishRing extends JewelryItem {

	public GnomishRing() {
		super();
		setMetal(Metal.GOLD);
		setMainGemstone(MainGemstone.RUBY);
		addAdditionalGemstone(AdditionalGemstone.CUBIC_ZIRCONIA);
		addAdditionalGemstone(AdditionalGemstone.CUBIC_ZIRCONIA);
		addAdditionalGemstone(AdditionalGemstone.CUBIC_ZIRCONIA);
		addAdditionalGemstone(AdditionalGemstone.CUBIC_ZIRCONIA);
	}

}
