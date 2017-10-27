package gameModes;

import game.Controller;

public class GameOfLifeConfig3 extends Controller {
	public GameOfLifeConfig3(int dimension, String gridType, int rule, String cellType) {
		super(dimension, gridType, rule, cellType);
		this.drawGrid();
	}

	public void drawGrid() {
		super.drawGrid();
	};
}
