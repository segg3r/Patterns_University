package task6;

import java.util.ArrayList;
import java.util.List;

import task6.ifaces.Command;

public class Controller {

	private List<Command> onCommands;
	private List<Command> offCommands;

	public Controller() {
		super();
		this.onCommands = new ArrayList<Command>();
		this.offCommands = new ArrayList<Command>();
	}

	public void addOnCommand(Command command) {
		this.onCommands.add(command);
	}

	public void addOffCommand(Command command) {
		this.offCommands.add(command);
	}

	public void on() {
		for (Command command : onCommands) {
			System.out.println(command);
			command.execute();
		}
	}

	public void off() {
		for (Command command : offCommands) {
			System.out.println(command);
			command.execute();
		}
	}

}
