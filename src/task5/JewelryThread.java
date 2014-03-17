package task5;

import task4.JewelryItem;

public abstract class JewelryThread extends Thread {

	private int minRange;
	private int maxRange;
	private JewelryMaster jewelryMaster;

	public JewelryThread(int minRange, int maxRange, JewelryMaster jewelryMaster) {
		super();
		this.minRange = minRange;
		this.maxRange = maxRange;
		this.jewelryMaster = jewelryMaster;
	}

	public void run() {
		try {
			while (true) {
				int sleepSeconds = (int) (minRange + Math.random()
						* (maxRange - minRange));
				long sleepTime = sleepSeconds * 1000;

				Thread.sleep(sleepTime);

			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	protected abstract JewelryItem getJewelryItemFromFactory();

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

}
