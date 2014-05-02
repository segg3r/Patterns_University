import task6.Controller;
import task6.beans.MorningGarden;
import task6.commands.MorningGardenOffCommand;
import task6.commands.MorningGardenOnCommand;

public class Task6Runner {

	public static void main(String[] args) {
		Controller controller = new Controller();

		MorningGarden morningGarden = new MorningGarden("morning garden");
		MorningGardenOnCommand morningGardenOnCommand = new MorningGardenOnCommand(
				morningGarden);
		MorningGardenOffCommand morningGardenOffCommand = new MorningGardenOffCommand(
				morningGarden);

		controller.addOnCommand(morningGardenOnCommand);
		controller.addOffCommand(morningGardenOffCommand);

		controller.on();
		controller.off();
	}

}
