package task4.gnomes;

import task4.AdditionalGemstone;
import task4.JewelryItem;
import task4.MainGemstone;
import task4.Metal;

public class GnomishNecklace extends JewelryItem {

	public GnomishNecklace() {
		super();
		setMetal(Metal.SILVER);
		setMainGemstone(MainGemstone.RUBY);
		addAdditionalGemstone(AdditionalGemstone.DIAMOND);
		addAdditionalGemstone(AdditionalGemstone.CUBIC_ZIRCONIA);
	}

}
