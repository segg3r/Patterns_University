import task5.JewelryMaster;
import task5.jewelrythreads.BroochJewelryThread;
import task5.jewelrythreads.NecklaceJewelryThread;
import task5.jewelrythreads.RingJewelryThread;

public class Task5Runner {

	public static void main(String[] args) {
		JewelryMaster jewelryMaster = JewelryMaster.getInstance();

		for (int i = 0; i < 5; i++) {
			new BroochJewelryThread(jewelryMaster).start();
			new NecklaceJewelryThread(jewelryMaster).start();
			new RingJewelryThread(jewelryMaster).start();
		}
	}

}
