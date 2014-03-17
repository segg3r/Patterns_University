package task4;

public class Metal {

	public static final Metal GOLD = new Metal("gold");
	public static final Metal SILVER = new Metal("silver");

	private String name;

	public Metal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Metal [name=" + name + "]";
	}

}
