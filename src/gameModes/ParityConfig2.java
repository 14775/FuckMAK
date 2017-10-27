package gameModes;

import game.Controller;

public class ParityConfig2 extends Controller {
	public ParityConfig2(int dimension, String gridType, int rule, String cellType) {
		super(dimension, gridType, rule, cellType);
		boolean lives;
		for (int row = 0; row < this.grid.getGridDimension() - 1; row++) {
			if (row % 2 == 0) {
				lives = false;
			} else {
				lives = true;
			}
			for (int col = 0; col < this.grid.getGridDimension() - 1; col++) {
				if (lives) {
					this.grid.getCell(row, col).live();
				} else {
					this.grid.getCell(row, col).die();
				}
				lives = !lives;
			}
		}
		this.drawGrid();
	}
}
