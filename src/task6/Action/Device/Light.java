package task6.Action.Device;

public class Light {
	private String light = "no shine";
	private String name = "";

	public Light() {

	}

	public Light(String name) {
		this.name = name;
	}

	public void on() {
		light = "shine";
		System.out.println(this);
	};

	public void off() {
		light = "no shine";
		System.out.println(this);
	};

	public String toString() {
		return this.getClass().getSimpleName() + ": " + name + " - " + light;
	}
}
