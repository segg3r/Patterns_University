package task6.commands;

import task6.beans.Light;
import task6.ifaces.Command;

public class DisableLightCommand implements Command {

	private Light light;

	public DisableLightCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.disable();
	}

	public String toString() {
		return "disabling light: " + light.getName();
	}

}
