package task6.Action.Command;

import task6.Action.Device.Stereo;

public class StereoOffCommand implements Command {
	private Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		stereo.off();
	}
}