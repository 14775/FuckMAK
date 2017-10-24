package gameModes;

import game.GenerationConf3;

public class GameOfLife3 {

	public static void main(String[] args) {
		GenerationConf3 newGen = new GenerationConf3(300, "2DArray", 0, "Moore");
		newGen.nextGeneration();
		newGen.drawGrid();
	}

}
