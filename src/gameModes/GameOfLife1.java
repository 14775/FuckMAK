package gameModes;

import game.Controller;

public class GameOfLife1 {
	static Controller controller = new Controller();

	public static void main(String[] args) {
		controller.createGame(40, "2DArray", 0, "Moore", 1, 5);
		setStartConfiguration();
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

	private static void setStartConfiguration2() {
		controller.getGrid().getCell(1, 1).live();
	}
}