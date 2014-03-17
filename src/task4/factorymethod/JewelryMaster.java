package task4.factorymethod;

public abstract class JewelryMaster {

	public JewelryMaster() {
		super();
	}

	public JewelryItem orderJewelryItem(JewelryItemType jewelryItemType) {
		JewelryItem jewelryItem = createJewelryItem(jewelryItemType);
		jewelryItem.formBase();
		jewelryItem.cutGemstones();
		jewelryItem.insertGemstones();
		return jewelryItem;
	}

	protected abstract JewelryItem createJewelryItem(
			JewelryItemType jewelryItemType);

	public String toString() {
		return getClass().getSimpleName();
	}
}
