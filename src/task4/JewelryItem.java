package task4;

import java.util.ArrayList;
import java.util.List;

public class JewelryItem {

	private Metal metal;
	private MainGemstone mainGemstone;
	private List<AdditionalGemstone> additionalGemstones;

	private List<String> process;

	public JewelryItem() {
		super();
		additionalGemstones = new ArrayList<AdditionalGemstone>();
		process = new ArrayList<String>();
	}

	public void fillFromFactory(IngridientFactory ingridientFactory) {
		metal = ingridientFactory.getMetal();
		mainGemstone = ingridientFactory.getMainGemstone();
		additionalGemstones = ingridientFactory.getAdditionalGemstones();
	}

	public void formBase() {
		process.add("based form with " + metal);
	}

	public void cutGemstones() {
		process.add("cut main gemstone " + mainGemstone);
		for (AdditionalGemstone additionalGemstone : additionalGemstones) {
			process.add("cut additional gemstone " + additionalGemstone);
		}
	}

	public void insertGemstones() {
		process.add("insert main gemstone " + mainGemstone);
		for (AdditionalGemstone additionalGemstone : additionalGemstones) {
			process.add("insert additional gemstone " + additionalGemstone);
		}
	}

	public Metal getMetal() {
		return metal;
	}

	public void setMetal(Metal metal) {
		this.metal = metal;
	}

	public MainGemstone getMainGemstone() {
		return mainGemstone;
	}

	public void setMainGemstone(MainGemstone mainGemstone) {
		this.mainGemstone = mainGemstone;
	}

	public List<AdditionalGemstone> getAdditionalGemstones() {
		return additionalGemstones;
	}

	public void setAdditionalGemstones(
			List<AdditionalGemstone> additionalGemstones) {
		this.additionalGemstones = additionalGemstones;
	}

	public void addProcessString(String processString) {
		process.add(processString);
	}

	public void addAdditionalGemstone(AdditionalGemstone additionalGemstone) {
		additionalGemstones.add(additionalGemstone);
	}

	public String getProcess() {
		StringBuilder sb = new StringBuilder();
		for (String processString : process) {
			sb.append(Character.toUpperCase(processString.charAt(0)));
			sb.append(processString.substring(1));
			sb.append(".\n");
		}
		String result = sb.toString();
		return result;
	}

}
