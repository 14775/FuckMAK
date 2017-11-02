package gameModes;

import game.Controller;
import settings.Datastructure;
import settings.LogType;
import settings.Neighborhood;

public class GameOfLife_Experiment_3_1 {
	static Controller controller = new Controller();

	public static void main(String[] args) {
		controller.createGame(300, Datastructure.ARRAY, 0, Neighborhood.MOORE, 0, 100, LogType.SAVETOFILE);
		controller.evolve();
	}
}