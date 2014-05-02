package task6.Action.Device;

public class Stereo {
	private String device = "CD";
	private String state = "off";
	private int volume;

	public void on() {
		state = "on";
		System.out.println(this.getClass().getSimpleName() + ": state - "
				+ state); // Ñ‚ÐµÑ�Ñ‚
	}

	public void off() {
		state = "off";
		System.out.println(this.getClass().getSimpleName() + ": state - "
				+ state); // Ñ‚ÐµÑ�Ñ‚
	}

	public void setCD() {
		device = "CD";
		System.out.println(this.getClass().getSimpleName() + ": device - "
				+ device); // Ñ‚ÐµÑ�Ñ‚
	}

	public void setDVD() {
		device = "DVD";
		System.out.println(this.getClass().getSimpleName() + ": device - "
				+ device); // Ñ‚ÐµÑ�Ñ‚
	}

	public void setRadio() {
		device = "Radio";
		System.out.println(this.getClass().getSimpleName() + ": device - "
				+ device); // Ñ‚ÐµÑ�Ñ‚
	}

	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println(this.getClass().getSimpleName() + ": volume - "
				+ volume); // Ñ‚ÐµÑ�Ñ‚
	}

	public int getVolume() {
		return volume;
	}

	public String toString() {
		return this.getClass().getSimpleName() + ": device - " + device + ", "
				+ state + ", volume - " + volume;
	}

}
