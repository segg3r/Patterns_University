package task6.commands;

import task6.beans.Spinkler;
import task6.ifaces.Command;

public class EnableSpinklerCommand implements Command {

	private Spinkler spinkler;

	public EnableSpinklerCommand(Spinkler spinkler) {
		super();
		this.spinkler = spinkler;
	}

	@Override
	public void execute() {
		spinkler.enable();
	}

	public String toString() {
		return "enabling spinkler: " + spinkler.getName();
	}

}
