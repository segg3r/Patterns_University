package task6.commands;

import java.util.ArrayList;
import java.util.List;

import task6.ifaces.Command;

public class MacroCommand implements Command {

	private List<Command> commands;

	public MacroCommand() {
		super();
		this.commands = new ArrayList<Command>();
	}

	public MacroCommand(Command... commands) {
		this();
		for (Command command : commands) {
			this.commands.add(command);
		}
	}

	@Override
	public void execute() {
		for (Command command : commands) {
			command.execute();
		}
	}

	public String toString() {
		return commands.toString();
	}

}
