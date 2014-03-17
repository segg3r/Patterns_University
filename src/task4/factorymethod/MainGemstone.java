package task4.factorymethod;

public class MainGemstone extends Gemstone {

	public static final MainGemstone EMERALD = new MainGemstone("emerald");
	public static final MainGemstone RUBY = new MainGemstone("ruby");

	public MainGemstone(String name) {
		super(name);
	}

}
