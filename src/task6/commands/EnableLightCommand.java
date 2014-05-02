package task6.commands;

import task6.beans.Light;
import task6.ifaces.Command;

public class EnableLightCommand implements Command {

	private Light light;

	public EnableLightCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.enable();
	}

	public String toString() {
		return "disabling light: " + light.getName();
	}

}
