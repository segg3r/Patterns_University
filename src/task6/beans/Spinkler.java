package task6.beans;

public class Spinkler extends NamedEntity {

	private boolean enabled = false;

	public Spinkler(String name) {
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
