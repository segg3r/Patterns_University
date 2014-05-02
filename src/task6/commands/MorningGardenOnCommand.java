package task6.commands;

import task6.beans.MorningGarden;

public class MorningGardenOnCommand extends MacroCommand {

	public MorningGardenOnCommand(MorningGarden morningGarden) {
		super(new EnableSpinklerCommand(morningGarden.getSpinkler()),
				new DisableLightCommand(morningGarden.getGardenLight()),
				new DisableLightCommand(morningGarden.getOutdoorLight()));
	}

}
