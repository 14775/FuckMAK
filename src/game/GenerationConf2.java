package game;

public class GenerationConf2 extends SuperGeneration {
	public GenerationConf2(int dimension, String gridType, int rule, String cellType) {
		super(dimension, gridType, rule, cellType);
		boolean lives;
		for (int row = 0; row < this.grid.getGridLength() - 1; row++) {
			if (row % 2 == 0) {
				lives = false;
			} else {
				lives = true;
			}
			for (int col = 0; col < this.grid.getGridLength() - 1; col++) {
				if (lives) {
					this.grid.getCell(row, col).live();
				} else {
					this.grid.getCell(row, col).die();
				}
				lives = !lives;
			}
		}
		this.drawGrid();
	};

	public void drawGrid() {
		super.drawGrid();
	};
}
