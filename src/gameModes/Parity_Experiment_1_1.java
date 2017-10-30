package gameModes;

import game.Controller;
import settings.Datastructure;
import settings.LogType;
import settings.Neighborhood;

public class Parity_Experiment_1_1 {
	static Controller controller = new Controller();

	public static void main(String[] args) {
		controller.createGame(400, Datastructure.ARRAY, 1, Neighborhood.VONNEUMANN, 2, 100, LogType.SAVETOFILE);
		setStartConfiguration();
		controller.evolve();
	}

	public static void setStartConfiguration() {
		int cellpos;
		cellpos = ((controller.getGrid().getGridDimension() - 2) / 2) + 1;
		controller.getGrid().getCell(cellpos, cellpos).live();
		controller.getGrid().getCell(cellpos, cellpos + 1).live();
		controller.getGrid().getCell(cellpos + 1, cellpos).live();
		controller.getGrid().getCell(cellpos + 1, cellpos + 1).live();

	}
}