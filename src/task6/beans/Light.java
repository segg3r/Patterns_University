package task6.beans;

public class Light extends NamedEntity {

	private boolean enabled = false;

	public Light(String name) {
		super(name);
	}

	public void enable() {
		this.enabled = true;
	}

	public void disable() {
		this.enabled = false;
	}

	public boolean isEnabled() {
		return enabled;
	}

}
