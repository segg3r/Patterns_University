package task5.jewelrythreads;

import task4.JewelryItemType;
import task5.JewelryMaster;
import task5.JewelryThread;

public class NecklaceJewelryThread extends JewelryThread {

	public NecklaceJewelryThread(JewelryMaster jewelryMaster) {
		super(1, 25, jewelryMaster, JewelryItemType.NECKLACE);
	}

}
