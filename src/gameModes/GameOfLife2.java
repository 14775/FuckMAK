package gameModes;

import game.GenerationConf2;

public class GameOfLife2 {

	public static void main(String[] args) {
		GenerationConf2 newGen = new GenerationConf2(100, "2DArray", 0, "Moore");
		for (int i = 0; i <= 10; i++) {
			newGen.nextGeneration();
			newGen.drawGrid();
		}
	}
}
