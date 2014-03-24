package task5.jewelrythreads;

import task4.JewelryItemType;
import task5.JewelryMaster;
import task5.JewelryThread;

public class BroochJewelryThread extends JewelryThread {

	public BroochJewelryThread(JewelryMaster jewelryMaster) {
		super(50, 70, jewelryMaster, JewelryItemType.BROOCH);
	}

}
