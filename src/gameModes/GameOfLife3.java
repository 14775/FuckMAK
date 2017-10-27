package gameModes;

import game.Controller;

public class GameOfLife3 {
	static Controller controller = new Controller();

	public static void main(String[] args) {
		controller.createGame(300, "HashMap", 0, "Moore", 1);
		controller.drawGrid();
		controller.nextGeneration();
	}
}