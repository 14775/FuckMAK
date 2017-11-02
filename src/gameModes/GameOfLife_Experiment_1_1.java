package gameModes;

import game.Controller;
import settings.Datastructure;
import settings.LogType;
import settings.Neighborhood;

public class GameOfLife_Experiment_1_1 {
	static Controller controller = new Controller();

	public static void main(String[] args) {
		controller.createGame(40, Datastructure.ARRAY, 0, Neighborhood.MOORE, 0, 100, LogType.SAVETOFILE);
		setStartConfiguration();
		controller.evolve();
	}

	private static void setStartConfiguration() {

		controller.getGrid().getCell(17, 17).live();
		controller.getGrid().getCell(17, 18).live();
		controller.getGrid().getCell(17, 20).live();
		controller.getGrid().getCell(17, 21).live();
		controller.getGrid().getCell(18, 17).live();
		controller.getGrid().getCell(18, 18).live();
		controller.getGrid().getCell(18, 20).live();
		controller.getGrid().getCell(18, 21).live();
		controller.getGrid().getCell(19, 18).live();
		controller.getGrid().getCell(19, 20).live();
		controller.getGrid().getCell(20, 16).live();
		controller.getGrid().getCell(20, 18).live();
		controller.getGrid().getCell(20, 20).live();
		controller.getGrid().getCell(20, 22).live();
		controller.getGrid().getCell(21, 16).live();
		controller.getGrid().getCell(21, 18).live();
		controller.getGrid().getCell(21, 20).live();
		controller.getGrid().getCell(21, 22).live();
		controller.getGrid().getCell(22, 16).live();
		controller.getGrid().getCell(22, 17).live();
		controller.getGrid().getCell(22, 21).live();
		controller.getGrid().getCell(22, 22).live();

	}

}