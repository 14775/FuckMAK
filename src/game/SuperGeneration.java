package game;

import java.util.List;

import celltypes.MooreCell;
import celltypes.VonNeumannCell;
import rules.GameOfLifeRules;
import rules.ParityModelRules;

public class SuperGeneration {
	public Cells[][] grid;
	public Rules rules;
	private int dimension;
	protected long generationNumber;
	protected Cells[][] newGrid;

	public SuperGeneration(int dimension, int gridType, int rules) {
		this.dimension = dimension;
		this.generationNumber = 0;
		this.createNewGrid(gridType);
		if (rules == 0)
			this.rules = new GameOfLifeRules();
		if (rules == 1)
			this.rules = new ParityModelRules();

	}

	// TODO Create & Draw Grid should have its own class
	// Gridtype ist in diesem Fall der Zellentyp!!! 0 = Moore ; 1 = vonNeumann
	protected void createNewGrid(int gridType) {
		if (gridType == 0) {
			grid = new MooreCell[dimension][dimension];
			for (int row = 0; row < grid.length; row++) {
				for (int col = 0; col < grid[row].length; col++) {
					grid[row][col] = new MooreCell(row, col);
				}
			}
		}
		if (gridType == 1) {
			grid = new VonNeumannCell[dimension][dimension];
			for (int row = 0; row < grid.length; row++) {
				for (int col = 0; col < grid[row].length; col++) {
					grid[row][col] = new VonNeumannCell(row, col);
				}
			}
		}
	}

	public void drawGrid() {
		System.out.print("### (" + generationNumber + ")");
		System.out.println();
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				System.out.print(grid[row][col].isAlive() ? '1' : '0');
			}
			System.out.println();
		}

	}

	public void nextGeneration() {
		this.newGrid = grid;
		for (int row = 0; row < newGrid.length; row++) {
			for (int col = 0; col < newGrid[row].length; col++) {
				if (newGrid[row][col].isAlive()) {
					int neighbors = 0;
					neighbors = getNumberOfAliveNeighbors(newGrid[row][col].neighbors());
					if (rules.mustStayAlive(neighbors) != true)
						newGrid[row][col].die();
					if (rules.mustBeBorn(neighbors))
						newGrid[row][col].live();
				}
			}
		}
		grid = newGrid;
		generationNumber++;

	}

	public int getNumberOfAliveNeighbors(List<Number> neighbors) {
		int numberOfAliveNeighbors = 0;
		for (int i = 0; i <= (neighbors.size() - 2); i++) {
			if (newGrid[(int) neighbors.get(i)][(int) neighbors.get(i + 1)].isAlive()) {
				numberOfAliveNeighbors++;
			}
		}
		return numberOfAliveNeighbors;
	}

}
