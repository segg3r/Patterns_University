package task6.Action.Device;

public class GarageDoor {
	private Light light = new Light("Garage");
	private String door = "";

	public void up() {
		door = "open";
		System.out
				.println(this.getClass().getSimpleName() + ": door - " + door); // Ñ‚ÐµÑ�Ñ‚
	}

	public void down() {
		door = "close";
		System.out
				.println(this.getClass().getSimpleName() + ": door - " + door); // Ñ‚ÐµÑ�Ñ‚
	}

	public void stop() {
		door = "stop";
		System.out
				.println(this.getClass().getSimpleName() + ": door - " + door); // Ñ‚ÐµÑ�Ñ‚
	}

	public void lightOn() {
		light.on();
	}

	public void lightOff() {
		light.off();
	}

	public String toString() {
		return this.getClass().getSimpleName() + ": door - " + door + ", "
				+ light;
	}
}
