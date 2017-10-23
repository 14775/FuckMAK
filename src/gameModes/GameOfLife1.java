package gameModes;

import game.GenerationConf1;

public class GameOfLife1 {
	public static void main(String[] args) {
		GenerationConf1 newGen = new GenerationConf1(40, 1, 0);
		newGen.nextGeneration();
		newGen.drawGrid();
	}

}