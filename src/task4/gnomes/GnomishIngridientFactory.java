package task4.gnomes;

import java.util.ArrayList;
import java.util.List;

import task4.AdditionalGemstone;
import task4.IngridientFactory;
import task4.MainGemstone;
import task4.Metal;

public class GnomishIngridientFactory extends IngridientFactory {

	@Override
	public Metal getMetal() {
		return Metal.SILVER;
	}

	@Override
	public MainGemstone getMainGemstone() {
		return MainGemstone.RUBY;
	}

	@Override
	public List<AdditionalGemstone> getAdditionalGemstones() {
		List<AdditionalGemstone> additionalGemstones = new ArrayList<AdditionalGemstone>();
		additionalGemstones.add(AdditionalGemstone.CUBIC_ZIRCONIA);
		additionalGemstones.add(AdditionalGemstone.CUBIC_ZIRCONIA);
		additionalGemstones.add(AdditionalGemstone.CUBIC_ZIRCONIA);
		return additionalGemstones;
	}

}
