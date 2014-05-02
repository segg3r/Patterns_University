package task6.Action.Command;

import task6.Action.Device.CeilingFan;

public class CeilingFanOffCommand implements Command {
	private CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	public void execute() {
		ceilingFan.off();
	}
}
