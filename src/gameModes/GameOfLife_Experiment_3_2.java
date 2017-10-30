package gameModes;

import game.Controller;
import settings.Datastructure;
import settings.LogType;
import settings.Neighborhood;

public class GameOfLife_Experiment_3_2 {
	static Controller controller = new Controller();

	public static void main(String[] args) {
		controller.createGame(300, Datastructure.HASHMAP, 0, Neighborhood.MOORE, 2, 100, LogType.SAVETOFILE);
		controller.evolve();
	}
}