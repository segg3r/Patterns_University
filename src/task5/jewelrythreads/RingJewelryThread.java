package task5.jewelrythreads;

import task4.JewelryItemType;
import task5.JewelryMaster;
import task5.JewelryThread;

public class RingJewelryThread extends JewelryThread {

	public RingJewelryThread(JewelryMaster jewelryMaster) {
		super(60, 80, jewelryMaster, JewelryItemType.RING);
	}

}
