package task5;

import task4.JewelryItem;
import task4.JewelryItemType;

public abstract class JewelryThread extends Thread {

	private int minRange;
	private int maxRange;
	private JewelryMaster jewelryMaster;
	private JewelryItemType jewelryItemType;

	public JewelryThread(int minRange, int maxRange,
			JewelryMaster jewelryMaster, JewelryItemType jewelryItemType) {
		super();
		this.minRange = minRange;
		this.maxRange = maxRange;
		this.jewelryMaster = jewelryMaster;
		this.setJewelryItemType(jewelryItemType);
	}

	public void run() {
		try {
			while (true) {
				int sleepSeconds = (int) (minRange + Math.random()
						* (maxRange - minRange));
				long sleepTime = sleepSeconds * 1000;

				Thread.sleep(sleepTime);

				synchronized (jewelryMaster) {
					JewelryItem jewelryItem = jewelryMaster
							.orderJewelryItem(jewelryItemType);
					System.out.println("Thread " + getId() + " ordered");
					System.out.println(jewelryItem.getProcess());
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public int getMinRange() {
		return minRange;
	}

	public void setMinRange(int minRange) {
		this.minRange = minRange;
	}

	public int getMaxRange() {
		return maxRange;
	}

	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}

	public JewelryMaster getJewelryMaster() {
		return jewelryMaster;
	}

	public void setJewelryMaster(JewelryMaster jewelryMaster) {
		this.jewelryMaster = jewelryMaster;
	}

	public JewelryItemType getJewelryItemType() {
		return jewelryItemType;
	}

	public void setJewelryItemType(JewelryItemType jewelryItemType) {
		this.jewelryItemType = jewelryItemType;
	}

}
