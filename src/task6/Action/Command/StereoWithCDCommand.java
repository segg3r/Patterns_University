package task6.Action.Command;

import task6.Action.Device.Stereo;

public class StereoWithCDCommand implements Command {
	private Stereo stereo;

	public StereoWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		stereo.setCD();
		stereo.setVolume(7);
		stereo.on();
	}

}
