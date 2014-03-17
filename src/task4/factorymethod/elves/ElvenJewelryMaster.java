package task4.factorymethod.elves;

import task4.factorymethod.JewelryItem;
import task4.factorymethod.JewelryItemType;
import task4.factorymethod.JewelryMaster;

public class ElvenJewelryMaster extends JewelryMaster {

	public ElvenJewelryMaster() {
		super();
	}

	@Override
	protected JewelryItem createJewelryItem(JewelryItemType jewelryItemType) {
		if (jewelryItemType.equals(JewelryItemType.BROOCH)) {
			return new ElvenBrooch();
		} else if (jewelryItemType.equals(JewelryItemType.NECKLACE)) {
			return new ElvenNecklace();
		} else if (jewelryItemType.equals(JewelryItemType.RING)) {
			return new ElvenRing();
		}
		return null;
	}

}
