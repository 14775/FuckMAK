package gameModes;

import game.Controller;
import settings.Datastructure;
import settings.Neighborhood;

public class GameOfLife3 {
	static Controller controller = new Controller();

	public static void main(String[] args) {
		controller.createGame(300, Datastructure.HASHMAP, 0, Neighborhood.MOORE, 1);
		controller.drawGrid();
		controller.nextGeneration();
	}
}