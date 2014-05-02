package task6.Action.Command;

import task6.Action.Device.Light;

public class LightOffCommand implements Command {
	private Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}
}
