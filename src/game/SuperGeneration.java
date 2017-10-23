package game;

import gridTypes.Grid;
import gridTypes.GridFactory;

public class SuperGeneration {
	protected Grid grid;
	private int dimension;
	private long generationNumber;

	protected SuperGeneration(String gridType, int dimension) {
		GridFactory factory = new GridFactory();
		this.dimension = dimension;
		this.grid = factory.createGrid(gridType, dimension);
		this.generationNumber = 0;
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
		// Cells[][] newGrid = grid;
		// for (int row = 0; row < newGrid.length; row++) {
		// for (int col = 0; col < newGrid[row].length; col++) {
		// newGrid[row][col] = isAlive(row, col); //auslagern, wohin?
		// Neue Klasse? ->
		// anwendung Regel Interface
		// }
		// grid = newGrid;
		generationNumber++;
	}
}
