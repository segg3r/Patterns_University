package task4.elves;

import java.util.ArrayList;
import java.util.List;

import task4.AdditionalGemstone;
import task4.IngridientFactory;
import task4.MainGemstone;
import task4.Metal;

public class ElvenIngridientFactory extends IngridientFactory {

	@Override
	public Metal getMetal() {
		return Metal.GOLD;
	}

	@Override
	public MainGemstone getMainGemstone() {
		return MainGemstone.EMERALD;
	}

	@Override
	public List<AdditionalGemstone> getAdditionalGemstones() {
		List<AdditionalGemstone> additionalGemstones = new ArrayList<AdditionalGemstone>();
		additionalGemstones.add(AdditionalGemstone.DIAMOND);
		additionalGemstones.add(AdditionalGemstone.DIAMOND);
		additionalGemstones.add(AdditionalGemstone.DIAMOND);
		return additionalGemstones;
	}

}
