package task4.factorymethod;

public abstract class Gemstone {

	private String name;

	public Gemstone(String name) {
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
		return "Gemstone [name=" + name + "]";
	}

}
