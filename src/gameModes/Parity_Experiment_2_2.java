package gameModes;

import game.Controller;

public class Parity_Experiment_2_2 {
	static Controller controller = new Controller();

	public static void main(String[] args) {
		controller.createGame(200, "HashMap", 1, "VonNeumann", 2, 100);
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