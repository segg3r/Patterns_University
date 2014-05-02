package task6.Action.Command;

import task6.Action.Device.Light;

// ÐºÐ»Ð°Ñ�Ñ� Ð´Ð¾Ð»Ð¶ÐµÐ½ Ñ€ÐµÐ°Ð»Ð¸Ð·Ð¾Ð²Ñ‹Ð²Ð°Ñ‚ÑŒ Ð¸Ð½Ñ‚ÐµÑ€Ñ„ÐµÐ¹Ñ� Command
public class LightOnCommand implements Command {
	private Light light;

	// Ð² ÐºÐ¾Ð½Ñ�Ñ‚Ñ€ÑƒÐºÑ‚Ð¾Ñ€ Ð¿ÐµÑ€ÐµÐ´Ð°ÐµÑ‚Ñ�Ñ� ÐºÐ¾Ð½ÐºÑ€ÐµÑ‚Ð½Ñ‹Ð¹
	// Ð¾Ð±ÑŠÐµÐºÑ‚, ÐºÐ¾Ñ‚Ð¾Ñ€Ñ‹Ð¼ Ð±ÑƒÐ´ÐµÑ‚ ÑƒÐ¿Ñ€Ð°Ð²Ð»Ñ�Ñ‚ÑŒ
	// ÐºÐ¾Ð¼Ð°Ð½Ð´Ð°
	public LightOnCommand(Light light) {
		this.light = light;
	}

	// Ð¼ÐµÑ‚Ð¾Ð´ execute() Ð²Ñ‹Ð·Ñ‹Ð²Ð°ÐµÑ‚ Ð¼ÐµÑ‚Ð¾Ð´ on() Ð¾Ð±ÑŠÐµÐºÑ‚Ð°
	// Ð¿Ð¾Ð»ÑƒÑ‡Ð°Ñ‚ÐµÐ»Ñ�
	public void execute() {
		light.on();
	}
}
