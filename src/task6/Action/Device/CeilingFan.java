package task6.Action.Device;

public class CeilingFan {
	public static final int HIGH = 12;
	public static final int MEDIUM = 8;
	public static final int LOW = 4;
	public static final int OFF = 0;
	private int speed;

	public void high() {
		setSpeed(HIGH);
	}

	public void medium() {
		setSpeed(MEDIUM);
	}

	public void low() {
		setSpeed(LOW);
	}

	public void off() {
		setSpeed(OFF);
	}

	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println(this); // Ñ‚ÐµÑ�Ñ‚
	}

	public String toString() {
		return this.getClass().getSimpleName() + ": speed " + speed;
	}

}
