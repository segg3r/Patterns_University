package task5;

import task4.IngridientFactory;
import task4.JewelryItem;
import task4.JewelryItemType;
import task4.gnomes.GnomishBrooch;
import task4.gnomes.GnomishIngridientFactory;
import task4.gnomes.GnomishNecklace;
import task4.gnomes.GnomishRing;

public class JewelryMaster {

	private static JewelryMaster uniqueInstance;

	private JewelryMaster() {
		super();
	}

	public static JewelryMaster getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new JewelryMaster();
		}

		return uniqueInstance;
	}

	public JewelryItem orderJewelryItem(JewelryItemType jewelryItemType) {
		JewelryItem jewelryItem = createJewelryItem(jewelryItemType);
		jewelryItem.formBase();
		jewelryItem.cutGemstones();
		jewelryItem.insertGemstones();
		return jewelryItem;
	}

	private JewelryItem createJewelryItem(JewelryItemType jewelryItemType) {
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

	public String toString() {
		return getClass().getSimpleName();
	}
}
