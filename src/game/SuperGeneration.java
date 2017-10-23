package game;

import gridTypes.Grid;
import gridTypes.GridFactory;

public class SuperGeneration {
	protected Grid grid;
	private int dimension;
	private long generationNumber;
	private String generationGridType;

	protected SuperGeneration(String gridType, int dimension) {
		GridFactory factory = new GridFactory();
		this.dimension = dimension;
		this.grid = factory.createGrid(gridType, dimension);
		this.generationNumber = 0;
		this.generationGridType = gridType;
	}

	protected void drawGrid() {
		System.out.print("### (" + generationNumber + ")");
		System.out.println();
		for (int row = 0; row < grid.getGridLength(); row++) {
			for (int col = 0; col < grid.getGridLength(); col++) {
				System.out.print(grid.getCell(row, col).isAlive() ? '1' : '0');
			}
			System.out.println();
		}

	}

	protected void nextGeneration() {
		Grid newGrid = this.grid;
		for (int row = 0; row < newGrid.getGridLength(); row++) {
			for (int col = 0; col < newGrid.getGridLength(); col++) {
				// newGrid[row][col] = isAlive(row, col); //auslagern, wohin?
				// Neue Klasse? ->
				// anwendung Regel Interface
			}
			grid = newGrid;
			generationNumber++;
		}
	}
}