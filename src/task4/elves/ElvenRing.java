package task4.elves;

import task4.AdditionalGemstone;
import task4.JewelryItem;
import task4.MainGemstone;
import task4.Metal;

public class ElvenRing extends JewelryItem {

	public ElvenRing() {
		super();
		setMetal(Metal.GOLD);
		setMainGemstone(MainGemstone.RUBY);
		addAdditionalGemstone(AdditionalGemstone.CUBIC_ZIRCONIA);
		addAdditionalGemstone(AdditionalGemstone.CUBIC_ZIRCONIA);
		addAdditionalGemstone(AdditionalGemstone.CUBIC_ZIRCONIA);
		addAdditionalGemstone(AdditionalGemstone.CUBIC_ZIRCONIA);
	}

}
