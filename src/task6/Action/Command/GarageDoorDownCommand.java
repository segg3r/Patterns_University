package task6.Action.Command;

import task6.Action.Device.GarageDoor;

public class GarageDoorDownCommand implements Command {
	private GarageDoor garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.down();
	}
}
