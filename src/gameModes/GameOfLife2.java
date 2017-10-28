package gameModes;

import game.Controller;
import settings.Datastructure;
import settings.Neighborhood;

public class GameOfLife2 {
	static Controller controller = new Controller();

	public static void main(String[] args) {
		controller.createGame(100, Datastructure.HASHMAP, 0, Neighborhood.MOORE, 1);
		setStartConfiguration();
		controller.drawGrid();
		controller.nextGeneration();
	}

	public static void setStartConfiguration() {
		boolean lives;
		for (int row = 0; row < controller.getGrid().getGridDimension() - 1; row++) {
			if (row % 2 == 0) {
				lives = false;
			} else {
				lives = true;
			}
			for (int col = 0; col < controller.getGrid().getGridDimension() - 1; col++) {
				if (lives) {
					controller.getGrid().getCell(row, col).live();
				} else {
					controller.getGrid().getCell(row, col).die();
				}
				lives = !lives;
			}
		}
		controller.drawGrid();
	}
}