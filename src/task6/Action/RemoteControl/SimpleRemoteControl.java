package task6.Action.RemoteControl;

import task6.Action.Command.Command;

public class SimpleRemoteControl {
	// Ð£Ð¿Ñ€Ð¾Ñ�Ñ‚Ð¸Ð¼ Ð¸Ñ�Ñ…Ð¾Ð´Ð½ÑƒÑŽ Ð·Ð°Ð´Ð°Ñ‡Ñƒ: Ð´Ð¾Ð¿ÑƒÑ�Ñ‚Ð¸Ð¼,
	// Ð¿ÑƒÐ»ÑŒÑ‚ Ð¾Ñ�Ð½Ð°Ñ‰ÐµÐ½
	// Ð²Ñ�ÐµÐ³Ð¾ Ð¾Ð´Ð½Ð¾Ð¹ ÐºÐ½Ð¾Ð¿ÐºÐ¾Ð¹ Ð¸ Ð¸Ð¼ÐµÐµÑ‚ Ð²Ñ�ÐµÐ³Ð¾ Ð¾Ð´Ð½Ñƒ
	// Ñ�Ñ‡ÐµÐ¹ÐºÑƒ
	// Ð´Ð»Ñ� Ñ…Ñ€Ð°Ð½ÐµÐ½Ð¸Ñ� ÑƒÐ¿Ñ€Ð°Ð²Ð»Ñ�ÐµÐ¼Ð¾Ð³Ð¾ ÑƒÑ�Ñ‚Ñ€Ð¾Ð¹Ñ�Ñ‚Ð²Ð°
	private Command slot;

	public SimpleRemoteControl() {
	}

	public void setCommand(Command command) {
		this.slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}

}
