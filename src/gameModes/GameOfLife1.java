package gameModes;

import game.Controller;

public class GameOfLife1 {
	static Controller controller = new Controller();

	public static void main(String[] args) {
		controller.createGame(40, "2DArray", 0, "Moore", 1);
		setStartConfiguration();
		// controller.drawGrid();
		controller.evolve();
	}

	private static void setStartConfiguration() {
		int row;
		int col;
		for (row = 18; row <= 23; row++) {
			for (col = 17; col <= 23; col++) {
				if (row == 18 || row == 19) {
					if (col == 18 || col == 19 || col == 21 || col == 22) {
						controller.getGrid().getCell(row, col).live();
					}
				}
				if (row == 20) {
					if (col == 19 || col == 21) {
						controller.getGrid().getCell(row, col).live();
					}
				}
				if (row == 21 || row == 22) {
					if (col == 17 || col == 19 || col == 21 || col == 23)
						controller.getGrid().getCell(row, col).live();
				}
				if (row == 23) {
					if (col == 17 || col == 18 || col == 22 || col == 23)
						controller.getGrid().getCell(row, col).live();
				}

			}
		}
		controller.drawGrid();
	}

	private static void setStartConfiguration2() {
		controller.getGrid().getCell(1, 1).live();
	}
}