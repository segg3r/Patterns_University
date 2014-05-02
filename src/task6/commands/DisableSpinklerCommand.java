package task6.commands;

import task6.beans.Spinkler;
import task6.ifaces.Command;

public class DisableSpinklerCommand implements Command {

	private Spinkler spinkler;

	public DisableSpinklerCommand(Spinkler spinkler) {
		super();
		this.spinkler = spinkler;
	}

	@Override
	public void execute() {
		spinkler.disable();
	}

	public String toString() {
		return "disabling spinkler: " + spinkler.getName();
	}

}
