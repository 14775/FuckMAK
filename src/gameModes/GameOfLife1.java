package gameModes;

import game.GenerationConf1;

public class GameOfLife1 {
	public static void main(String[] args) {
		GenerationConf1 newGen = new GenerationConf1(40, 0, 0);
		for (int i = 0; i <= 1000; i++) {
			newGen.nextGeneration();
			newGen.drawGrid();
		}
	}

}