package task6.beans;

public class MorningGarden extends NamedEntity {

	private Spinkler spinkler;
	private Light outdoorLight;
	private Light gardenLight;

	public MorningGarden(String name) {
		super(name);
		this.spinkler = new Spinkler("spinkler");
		this.outdoorLight = new Light("outdoor light");
		this.gardenLight = new Light("garden light");
	}

	public Spinkler getSpinkler() {
		return spinkler;
	}

	public Light getOutdoorLight() {
		return outdoorLight;
	}

	public Light getGardenLight() {
		return gardenLight;
	}

}
