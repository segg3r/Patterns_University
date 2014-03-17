package task4.factorymethod;

public class AdditionalGemstone extends Gemstone {

	public static final AdditionalGemstone DIAMOND = new AdditionalGemstone(
			"diamond");
	public static final AdditionalGemstone CUBIC_ZIRCONIA = new AdditionalGemstone(
			"cubic zirconia");

	public AdditionalGemstone(String name) {
		super(name);
	}

}
