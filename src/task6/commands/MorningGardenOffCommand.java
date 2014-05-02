package task6.commands;

import task6.beans.MorningGarden;

public class MorningGardenOffCommand extends MacroCommand {

	public MorningGardenOffCommand(MorningGarden morningGarden) {
		super(new DisableSpinklerCommand(morningGarden.getSpinkler()),
				new EnableLightCommand(morningGarden.getGardenLight()),
				new EnableLightCommand(morningGarden.getOutdoorLight()));
	}
}
