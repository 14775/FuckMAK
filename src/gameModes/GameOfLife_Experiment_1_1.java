package gameModes;

import game.Controller;
import log.Log;
import settings.Datastructure;
import settings.LogType;
import settings.Neighborhood;

public class GameOfLife_Experiment_1_1 {
	static Controller controller = new Controller();

	public static void main(String[] args) {
		controller.createGame(40, Datastructure.ARRAY, 0, Neighborhood.MOORE, 2, 100);
		setStartConfiguration();
		// controller.drawGrid();
		controller.evolve();
	}

	private static void setStartConfiguration() {

		controller.getGrid().getCell(18, 18).live();
		controller.getGrid().getCell(18, 19).live();
		controller.getGrid().getCell(18, 21).live();
		controller.getGrid().getCell(18, 22).live();
		controller.getGrid().getCell(19, 18).live();
		controller.getGrid().getCell(19, 19).live();
		controller.getGrid().getCell(19, 21).live();
		controller.getGrid().getCell(19, 22).live();
		controller.getGrid().getCell(20, 19).live();
		controller.getGrid().getCell(20, 21).live();
		controller.getGrid().getCell(21, 17).live();
		controller.getGrid().getCell(21, 19).live();
		controller.getGrid().getCell(21, 21).live();
		controller.getGrid().getCell(21, 23).live();
		controller.getGrid().getCell(22, 17).live();
		controller.getGrid().getCell(22, 19).live();
		controller.getGrid().getCell(22, 21).live();
		controller.getGrid().getCell(22, 23).live();
		controller.getGrid().getCell(23, 17).live();
		controller.getGrid().getCell(23, 18).live();
		controller.getGrid().getCell(23, 22).live();
		controller.getGrid().getCell(23, 23).live();

		controller.drawGrid();
	}

}