package gameModes;

import game.SuperGeneration;

public class GameOfLifeConfig1 extends SuperGeneration {
	public GameOfLifeConfig1(int dimension, String gridType, int rule, String cellType) {
		super(dimension, gridType, rule, cellType);
		int row;
		int col;
		for (row = 18; row <= 23; row++) {
			for (col = 17; col <= 23; col++) {
				if (row == 18 || row == 19) {
					if (col == 18 || col == 19 || col == 21 || col == 22) {
						this.grid.getCell(row, col).live();
					}
				}
				if (row == 20) {
					if (col == 19 || col == 21) {
						this.grid.getCell(row, col).live();
					}
				}
				if (row == 21 || row == 22) {
					if (col == 17 || col == 19 || col == 21 || col == 23)
						this.grid.getCell(row, col).live();
				}
				if (row == 23) {
					if (col == 17 || col == 18 || col == 22 || col == 23)
						this.grid.getCell(row, col).live();
				}

			}
		}
		this.drawGrid();
	};

	public void drawGrid() {
		super.drawGrid();
	};

}