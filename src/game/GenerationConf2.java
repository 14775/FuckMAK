package game;

public class GenerationConf2 extends SuperGeneration implements Generation {
	public GenerationConf2(int dimension, int gridType) {
		super(dimension, gridType);
		boolean lives;
		for (int row = 0; row < this.grid.length; row++) {
			if (row % 2 == 0) {
				lives = false;
			} else {
				lives = true;
			}
			for (int col = 0; col < this.grid[row].length; col++) {
				if (lives) {
					this.grid[row][col].live();
				} else {
					this.grid[row][col].die();
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
