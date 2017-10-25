package gameModes;

import game.GenerationConf1;

public class GameOfLife1 {
	public static void main(String[] args) {
		GenerationConf1 newGen = new GenerationConf1(40, "HashMap", 0, "Moore");
		for (int i = 1; i <= 10000; i++) {
			newGen.nextGeneration();
			newGen.drawGrid();
		}
	}

}