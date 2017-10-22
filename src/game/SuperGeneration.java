package game;

public class SuperGeneration {
	protected Cells[][] grid;
	private int dimension;
	private long generationNumber;

	protected SuperGeneration(int dimension, int gridType) {
		this.dimension = dimension;
		this.createNewGrid(gridType);
		this.generationNumber = 0;
	}
// TODO Create & Draw Grid should have its own class
	protected void createNewGrid(int gridType) {
		if (gridType == 0) {
			grid = new Cells[dimension][dimension];
			for (int row = 0; row < grid.length; row++) {
				for (int col = 0; col < grid[row].length; col++) {
					grid[row][col] = new Cells(row, col);
				}
			}
		}
	}

	protected void drawGrid() {
		System.out.print("### (" + generationNumber + ")");
		System.out.println();
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				System.out.print(grid[row][col].status() ? '1' : '0');
			}
			System.out.println();
		}

	}

	protected void nextGeneration() {
		Cells[][] newGrid = grid;
		for (int row = 0; row < newGrid.length; row++) {
			for (int col = 0; col < newGrid[row].length; col++) {
				// newGrid[row][col] = isAlive(row, col); //auslagern, wohin? Neue Klasse? ->
				// anwendung Regel Interface
			}
		}
		grid = newGrid;
		generationNumber++;
	}
}
