package task4.gnomes;

import task4.AdditionalGemstone;
import task4.JewelryItem;
import task4.MainGemstone;
import task4.Metal;

public class GnomishBrooch extends JewelryItem {

	public GnomishBrooch() {
		super();
		setMetal(Metal.SILVER);
		setMainGemstone(MainGemstone.EMERALD);
		addAdditionalGemstone(AdditionalGemstone.DIAMOND);
		addAdditionalGemstone(AdditionalGemstone.DIAMOND);
	}

}
