import task4.factorymethod.JewelryItem;
import task4.factorymethod.JewelryItemType;
import task4.factorymethod.JewelryMaster;
import task4.factorymethod.elves.ElvenJewelryMaster;
import task4.factorymethod.gnomes.GnomishJewelryMaster;

public class Task4Runner {

	public static void main(String[] args) {
		JewelryMaster[] jewelryMasters = new JewelryMaster[] {
				new ElvenJewelryMaster(), new GnomishJewelryMaster() };
		JewelryItemType[] jewelryItemTypes = new JewelryItemType[] {
				JewelryItemType.BROOCH, JewelryItemType.NECKLACE,
				JewelryItemType.RING };

		for (JewelryMaster jewelryMaster : jewelryMasters) {
			for (JewelryItemType jewelryItemType : jewelryItemTypes) {
				JewelryItem jewelryItem = jewelryMaster
						.orderJewelryItem(jewelryItemType);
				String process = jewelryItem.getProcess();
				System.out.println("=== " + jewelryMaster + " "
						+ jewelryItemType + " ===");
				System.out.println(process);
			}
		}
	}

}
