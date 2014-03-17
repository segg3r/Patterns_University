package task4.factorymethod.gnomes;

import task4.factorymethod.JewelryItem;
import task4.factorymethod.JewelryItemType;
import task4.factorymethod.JewelryMaster;

public class GnomishJewelryMaster extends JewelryMaster {

	public GnomishJewelryMaster() {
		super();
	}

	@Override
	protected JewelryItem createJewelryItem(JewelryItemType jewelryItemType) {
		if (jewelryItemType.equals(JewelryItemType.BROOCH)) {
			return new GnomishBrooch();
		} else if (jewelryItemType.equals(JewelryItemType.NECKLACE)) {
			return new GnomishNecklace();
		} else if (jewelryItemType.equals(JewelryItemType.RING)) {
			return new GnomishRing();
		}
		return null;
	}

}
