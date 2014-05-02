package task6.Action.Command;

import task6.Action.Device.CeilingFan;

public class CeilingFanOnCommand implements Command {
	private CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	public void execute() {
		ceilingFan.low();
	}
}
