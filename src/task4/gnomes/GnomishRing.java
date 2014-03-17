package task4.gnomes;

import task4.AdditionalGemstone;
import task4.JewelryItem;
import task4.MainGemstone;
import task4.Metal;

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
