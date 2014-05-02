package task6.Action.Test;

import task6.Action.Command.CeilingFanOffCommand;
import task6.Action.Command.CeilingFanOnCommand;
import task6.Action.Command.GarageDoorDownCommand;
import task6.Action.Command.GarageDoorUpCommand;
import task6.Action.Command.LightOffCommand;
import task6.Action.Command.LightOnCommand;
import task6.Action.Command.StereoOffCommand;
import task6.Action.Command.StereoWithCDCommand;
import task6.Action.Device.CeilingFan;
import task6.Action.Device.GarageDoor;
import task6.Action.Device.Light;
import task6.Action.Device.Stereo;
import task6.Action.RemoteControl.RemoteControl;

public class RemoteControlTest {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl();
		Light livingRoomLight = new Light("Living Room");
		rc.setCommand(0, new LightOnCommand(livingRoomLight),
				new LightOffCommand(livingRoomLight));

		Light kitchenLight = new Light("Kitchen");
		rc.setCommand(1, new LightOnCommand(kitchenLight), new LightOffCommand(
				kitchenLight));

		CeilingFan fan = new CeilingFan();
		rc.setCommand(2, new CeilingFanOnCommand(fan),
				new CeilingFanOffCommand(fan));

		GarageDoor door = new GarageDoor();
		rc.setCommand(3, new GarageDoorUpCommand(door),
				new GarageDoorDownCommand(door));

		Stereo stereo = new Stereo();
		rc.setCommand(4, new StereoWithCDCommand(stereo), new StereoOffCommand(
				stereo));

		System.out.println(rc);

		for (int i = 0; i < 5; i++) {
			System.out.println("[" + i + "] == slot == ");
			rc.onButtonWasPressed(i);
			System.out.println("---");
			rc.offButtonWasPressed(i);
		}

	}

}
