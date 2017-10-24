package gameModes;

import game.GenerationConf1;

public class GameOfLife1 {
	public static void main(String[] args) {
		GenerationConf1 newGen = new GenerationConf1(40, 0, 1);
		for (int i = 1; i <= 50; i++) {
			newGen.nextGeneration();
			newGen.drawGrid();
		}
	}

}