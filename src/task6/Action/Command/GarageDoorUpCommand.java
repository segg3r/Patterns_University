package task6.Action.Command;

import task6.Action.Device.GarageDoor;

public class GarageDoorUpCommand implements Command {
	private GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}

}
