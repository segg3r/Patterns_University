package task4.gnomes;

import task4.IngridientFactory;
import task4.JewelryItem;
import task4.JewelryItemType;
import task4.JewelryMaster;

public class GnomishJewelryMaster extends JewelryMaster {

	public GnomishJewelryMaster() {
		super();
	}

	@Override
	protected JewelryItem createJewelryItem(JewelryItemType jewelryItemType) {
		JewelryItem jewelryItem = null;

		if (jewelryItemType.equals(JewelryItemType.BROOCH)) {
			jewelryItem = new GnomishBrooch();
		} else if (jewelryItemType.equals(JewelryItemType.NECKLACE)) {
			jewelryItem = new GnomishNecklace();
		} else if (jewelryItemType.equals(JewelryItemType.RING)) {
			jewelryItem = new GnomishRing();
		}

		IngridientFactory ingridientFactory = new GnomishIngridientFactory();
		jewelryItem.fillFromFactory(ingridientFactory);
		return jewelryItem;
	}

}
