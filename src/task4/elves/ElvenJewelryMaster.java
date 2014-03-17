package task4.elves;

import task4.IngridientFactory;
import task4.JewelryItem;
import task4.JewelryItemType;
import task4.JewelryMaster;

public class ElvenJewelryMaster extends JewelryMaster {

	public ElvenJewelryMaster() {
		super();
	}

	@Override
	protected JewelryItem createJewelryItem(JewelryItemType jewelryItemType) {
		JewelryItem jewelryItem = null;

		if (jewelryItemType.equals(JewelryItemType.BROOCH)) {
			jewelryItem = new ElvenBrooch();
		} else if (jewelryItemType.equals(JewelryItemType.NECKLACE)) {
			jewelryItem = new ElvenNecklace();
		} else if (jewelryItemType.equals(JewelryItemType.RING)) {
			jewelryItem = new ElvenRing();
		}

		IngridientFactory ingridientFactory = new ElvenIngridientFactory();
		jewelryItem.fillFromFactory(ingridientFactory);
		return jewelryItem;
	}

}
