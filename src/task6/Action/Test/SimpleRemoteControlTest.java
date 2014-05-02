package task6.Action.Test;

import task6.Action.Command.GarageDoorUpCommand;
import task6.Action.Command.LightOnCommand;
import task6.Action.Device.GarageDoor;
import task6.Action.Device.Light;
import task6.Action.RemoteControl.SimpleRemoteControl;

public class SimpleRemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		remote.setCommand(lightOn);
		remote.buttonWasPressed();

		GarageDoor door = new GarageDoor();
		GarageDoorUpCommand doorUp = new GarageDoorUpCommand(door);
		remote.setCommand(doorUp);
		remote.buttonWasPressed();
	}
}
