package gameModes;

import game.SuperGeneration;

public class GameOfLifeConfig3 extends SuperGeneration {
	public GameOfLifeConfig3(int dimension, String gridType, int rule, String cellType) {
		super(dimension, gridType, rule, cellType);
		this.drawGrid();
	}

	public void drawGrid() {
		super.drawGrid();
	};
}
