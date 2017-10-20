package game;

public class Generation {
	private Cell[][] grid;
	private int dimension;
	private long generationNumber;

	private Generation(int dimension) {
		this.dimension = dimension;
		createNewGrid();
		this.generationNumber = 0;
	}

	public void createNewGrid() {
		grid = new Cell[dimension][dimension];
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				grid[row][col] = new Cell(row, col);
			}
		}
	}

	public void drawGrid() {
		System.out.print("### (" + generationNumber + ")");
		System.out.println();
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				System.out.print(grid[row][col].status() ? '1' : '0');
			}
			System.out.println();
		}

	}

	public void nextGeneration() {
		Cell[][] newGrid = grid;
		for (int row = 0; row < newGrid.length; row++) {
			for (int col = 0; col < newGrid[row].length; col++) {
				// newGrid[row][col] = isAlive(row, col); //auslagern, wohin? Neue Klasse? ->
				// anwendung Regel Interface
			}
		}
		grid = newGrid;
		generationNumber++;
	}

	public static Generation GenerationConf1() {
		Generation retGen = new Generation(40);
		int row;
		int col;
		for (row = 18; row <= 23; row++) {
			for (col = 18; col <= 23; col++) {
				if (row == 18 || row == 19) {
					if (col == 18 || col == 19 || col == 21 || col == 22) {
						retGen.grid[row][col].live();
					}
					if (row == 20) {
						if (col == 19 || col == 21) {
							retGen.grid[row][col].live();
						}
					}
					if (row == 21 || row == 22) {
						if (col == 17 || col == 19 || col == 21 || col == 23)
							retGen.grid[row][col].live();
					}
					if (row == 23) {
						if (col == 17 || col == 18 || col == 22 || col == 23) {
							retGen.grid[row][col].live();
						}
					}
				}
			}
		}
		retGen.drawGrid();
		return retGen;
	};

	public static Generation GenerationConf2() {
		Generation retGen = new Generation(100);
		for (int row = 0; row < retGen.grid.length; row++) {
			for (int col = 0; col < retGen.grid[row].length; col++) {
				boolean even = false;
				boolean uneven = true;
				if (row % 2 == 0) {
					if (even) {
						retGen.grid[row][col].live();
					} else {
						retGen.grid[row][col].die();
					}
					even = !even;
				} else {
					if (uneven) {
						retGen.grid[row][col].live();
					} else {
						retGen.grid[row][col].die();
					}
					uneven = !uneven;
				}
			}
		}
		return retGen;
	};

	public static Generation GenerationConf3() {
		Generation retGen = new Generation(300);
		return retGen;
	};
}
