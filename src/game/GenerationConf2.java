package game;

public class GenerationConf2 extends SuperGeneration implements Generation {
	public GenerationConf2(int dimension, int gridType) {
		super(dimension, gridType);
		boolean even = false;
		boolean uneven = true;
		// TODO See if second boolean can be removed
		for (int row = 0; row < this.grid.length; row++) {
			for (int col = 0; col < this.grid[row].length; col++) {
				if ((row % 2) == 0) {
					if (even) {
						this.grid[row][col].live();
					} else {
						this.grid[row][col].die();
					}
					even = !even;
				} else {
					if (uneven) {
						this.grid[row][col].live();
					} else {
						this.grid[row][col].die();
					}
					uneven = !uneven;
				}
			}
		}
		this.drawGrid();
	};

	public void drawGrid() {
		super.drawGrid();
	};
}
