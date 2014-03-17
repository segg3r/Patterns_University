package task4;

public class JewelryItemType {

	public static final JewelryItemType RING = new JewelryItemType("ring");
	public static final JewelryItemType NECKLACE = new JewelryItemType(
			"necklace");
	public static final JewelryItemType BROOCH = new JewelryItemType("brooch");

	private String name;

	public JewelryItemType(String name) {
		super();
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof JewelryItemType))
			return false;
		JewelryItemType jewelryItemType = (JewelryItemType) obj;
		return name.equals(jewelryItemType.name);
	}

	@Override
	public String toString() {
		return "JewelryItemType [name=" + name + "]";
	}

}
