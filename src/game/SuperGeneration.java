package game;

public  class SuperGeneration{
	protected Cell[][] grid;
	private int dimension;
	private long generationNumber;

	protected SuperGeneration(int dimension,int gridType) {
		this.dimension = dimension;
		this.createNewGrid();
		this.generationNumber = 0;
	}
	
	
	protected void createNewGrid() {
		grid = new Cell[dimension][dimension];
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				grid[row][col] = new Cell(row, col);
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
}
