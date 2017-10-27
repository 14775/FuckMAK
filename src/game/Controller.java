package game;

import java.util.ArrayList;
import java.util.List;

import breakconditions.IBreakCondition;
import breakconditions.SameGridBreakCondition;
import grid.types.Grid;
import grid.types.GridFactory;
import rules.GameOfLifeRules;
import rules.ParityModelRules;

public class Controller {

	protected Rules rules;
	protected Grid grid;

	public Grid getGrid() {
		return this.grid;
	}

	private int dimension;
	protected int generationNumber;
	private Grid newGrid;
	private List<IBreakCondition> breakConditions = new ArrayList<IBreakCondition>();

	public Controller() {

	}

	public void createGame(int dimension, String gridType, int rules, String cellType, int breakCondition) {
		GridFactory factory = new GridFactory();
		this.dimension = dimension;
		this.grid = factory.createGrid(gridType, dimension, cellType);
		this.generationNumber = 0;

		if (rules == 0)
			this.rules = new GameOfLifeRules();
		if (rules == 1)
			this.rules = new ParityModelRules();
		if (breakCondition == 0) {
			breakConditions.add(new SameGridBreakCondition());
		}
	}

	public void drawGrid() {
		System.out.print("### (" + generationNumber + ")");
		System.out.println();
		for (int row = 0; row < grid.getGridDimension() - 1; row++) {
			for (int col = 0; col < grid.getGridDimension() - 1; col++) {
				System.out.print(grid.getCell(row, col).isAlive() ? '1' : '0');
			}
			System.out.println();
		}

	}

	public void nextGeneration() {
		boolean mustBreak = false;
		newGrid = this.grid.cloneGrid();
		for (int row = 0; row < newGrid.getGridDimension(); row++) {
			for (int col = 0; col < newGrid.getGridDimension(); col++) {

				int aliveNeighbors = 0;
				aliveNeighbors = getNumberOfAliveNeighbors(this.grid.getCell(row, col).neighbors());
				if (!rules.mustStayAlive(aliveNeighbors))
					newGrid.getCell(row, col).die();
				if (rules.mustBeBorn(aliveNeighbors))
					newGrid.getCell(row, col).live();
			}

		}
		generationNumber++;

		for (int i = 0; i < breakConditions.size(); i++) {
			mustBreak = breakConditions.get(i).mustBreak(grid, newGrid, generationNumber);
			System.out.println(mustBreak);
		}

		grid = newGrid;

		if (!mustBreak) {
			drawGrid();
			nextGeneration();
		}
	}

	public int getNumberOfAliveNeighbors(List<Number> neighbors) {
		int numberOfAliveNeighbors = 0;
		for (int i = 0; i <= (neighbors.size() - 1); i += 2) {
			// Am Rand abschneiden
			// TODO Komplexheit reduzieren!
			if ((int) neighbors.get(i) > -1 && (int) neighbors.get(i + 1) > -1 && (int) neighbors.get(i) < dimension
					&& (int) neighbors.get(i + 1) < dimension) {
				if (grid.getCell((int) neighbors.get(i), (int) neighbors.get(i + 1)).isAlive()) {
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
