package task6.Action.RemoteControl;

import task6.Action.Command.Command;
import task6.Action.Command.NoCommand;

public class RemoteControl {
	private Command[] onCommands;
	private Command[] offCommands;
	private NoCommand noCommand = new NoCommand();

	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		for (int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPressed(int slot) {
		onCommands[slot].execute();
	}

	public void offButtonWasPressed(int slot) {
		offCommands[slot].execute();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n-------- Remote Control ---------\n");
		for (int i = 0; i < onCommands.length; i++) {
			sb.append("[slot " + i + "] ");
			sb.append(onCommands[i].getClass().getSimpleName() + ", ");
			sb.append(offCommands[i].getClass().getSimpleName() + "\n");
		}
		return sb.toString();
	}
}
