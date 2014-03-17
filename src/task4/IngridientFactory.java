package task4;

import java.util.List;

public abstract class IngridientFactory {

	public abstract Metal getMetal();

	public abstract MainGemstone getMainGemstone();

	public abstract List<AdditionalGemstone> getAdditionalGemstones();

}
