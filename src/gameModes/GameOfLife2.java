package gameModes;

import game.GenerationConf2;

public class GameOfLife2 {

	public static void main(String[] args) {
		GenerationConf2 newGen = new GenerationConf2(100, "HashMap", 0, "Moore");
		for (int i = 1; i <= 100; i++) {
			newGen.nextGeneration();
			newGen.drawGrid();
		}
	}
}
