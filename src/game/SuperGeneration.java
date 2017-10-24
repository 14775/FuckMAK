package game;

import java.util.List;

import gridTypes.Grid;
import gridTypes.GridFactory;
import rules.GameOfLifeRules;
import rules.ParityModelRules;

public class SuperGeneration {
	protected Rules rules;
	protected Grid grid;
	private int dimension;
	protected long generationNumber;
	private Grid newGrid;

	public SuperGeneration(int dimension, String gridType, int rules, String cellType) {
		GridFactory factory = new GridFactory();
		this.dimension = dimension;
		this.grid = factory.createGrid(gridType, dimension, cellType);
		this.generationNumber = 0;
		if (rules == 0)
			this.rules = new GameOfLifeRules();
		if (rules == 1)
			this.rules = new ParityModelRules();

	}

	public void drawGrid() {
		System.out.print("### (" + generationNumber + ")");
		System.out.println();
		for (int row = 0; row < grid.getGridLength(); row++) {
			for (int col = 0; col < grid.getGridLength(); col++) {
				System.out.print(grid.getCell(row, col).isAlive() ? '1' : '0');
			}
			System.out.println();
		}

	}

	public void nextGeneration() {
		newGrid = grid;
		for (int row = 0; row < newGrid.getGridLength(); row++) {
			for (int col = 0; col < newGrid.getGridLength(); col++) {
				if (newGrid.getCell(row, col).isAlive()) {
					int neighbors = 0;
					neighbors = getNumberOfAliveNeighbors(newGrid.getCell(row, col).neighbors());
					if (rules.mustStayAlive(neighbors) != true)
						newGrid.getCell(row, col).die();
					if (rules.mustBeBorn(neighbors))
						newGrid.getCell(row, col).live();
				}
			}
		}
		grid = newGrid;
		generationNumber++;

	}

	public int getNumberOfAliveNeighbors(List<Number> neighbors) {
		int numberOfAliveNeighbors = 0;
		for (int i = 0; i <= (neighbors.size() - 2); i++) {
			// Am Rand abschneiden
			// TODO komplexität reduzieren!
			if ((int) neighbors.get(i) > -1 && (int) neighbors.get(i + 1) > -1 && (int) neighbors.get(i) < dimension
					&& (int) neighbors.get(i + 1) < dimension) {
				if (newGrid.getCell((int) neighbors.get(i), (int) neighbors.get(i + 1)).isAlive()) {
					numberOfAliveNeighbors++;
				}
			}
		}
		return numberOfAliveNeighbors;
	}

	public Rules getRules() {
		return rules;
	}

	public void setRules(Rules rules) {
		this.rules = rules;
	}

}
