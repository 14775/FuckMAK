package game;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import breakconditions.IBreakCondition;
import breakconditions.MaxTurnsBreakCondition;
import breakconditions.SameGridBreakCondition;
import grid.types.Grid;
import grid.types.GridFactory;
import log.Log;
import rules.GameOfLifeRules;
import rules.ParityModelRules;
import settings.Datastructure;
import settings.LogType;
import settings.Neighborhood;
import timer.TimeControl;

public class Controller {

	protected Rules rules;
	protected Grid grid;

	public Grid getGrid() {
		return this.grid;
	}

	private int dimension;
	protected int generationNumber;

	public int getGenerationNumber() {
		return generationNumber;
	}

	private Grid newGrid;
	private List<IBreakCondition> breakConditions = new ArrayList<IBreakCondition>();
	private int maxTurns;

	public void createGame(int dimension, Datastructure gridType, int rules, Neighborhood cellType,
			int breakCondition) {
		if (!TimeControl.getRunning()) {
			TimeControl.startTimer();
		}
		if (!Log.getInitilized()) {
			Log.initLog(LogType.NOLOG, rules, gridType, dimension, cellType);
		}
		GridFactory factory = new GridFactory();
		this.dimension = dimension;
		this.grid = factory.createGrid(gridType, dimension, cellType);
		this.generationNumber = 0;

		if (rules == 0)
			this.rules = new GameOfLifeRules();
		if (rules == 1)
			this.rules = new ParityModelRules();
		if (breakCondition == 1)
			breakConditions.add(new SameGridBreakCondition());
		if (breakCondition == 0)
			breakConditions.add(new MaxTurnsBreakCondition(maxTurns));
		if (breakCondition == 2) {
			breakConditions.add(new SameGridBreakCondition());
			breakConditions.add(new MaxTurnsBreakCondition(maxTurns));
		}

	}

	public void createGame(int dimension, Datastructure gridType, int rules, Neighborhood cellType, int breakCondition,
			int maxTurns) {
		TimeControl.startTimer();
		this.maxTurns = maxTurns;
		this.createGame(dimension, gridType, rules, cellType, breakCondition);
	}

	public void createGame(int dimension, Datastructure gridType, int rules, Neighborhood cellType, int breakCondition,
			int maxTurns, LogType logType) {
		TimeControl.startTimer();
		Log.initLog(logType, rules, gridType, dimension, cellType);
		this.maxTurns = maxTurns;
		this.createGame(dimension, gridType, rules, cellType, breakCondition);
	}

	public void createGame(int dimension, Datastructure gridType, int rules, Neighborhood cellType, int breakCondition,
			LogType logType) {
		TimeControl.startTimer();
		Log.initLog(logType, rules, gridType, dimension, cellType);
		this.createGame(dimension, gridType, rules, cellType, breakCondition);
	}

	public void drawGrid() {
		Log.append("\n### (" + generationNumber + ")" + "\n");
		for (int row = 0; row < grid.getGridDimension(); row++) {
			for (int col = 0; col < grid.getGridDimension(); col++) {
				Log.append(String.valueOf(grid.getCell(row, col).isAlive() ? '1' : '0'));
			}
			Log.append("\n");
		}
		increaseGenerationNumber();

	}

	public void increaseGenerationNumber() {
		this.generationNumber++;
	}

	public void evolve() {
		boolean mustBreak = false;
		drawGrid();

		while (!mustBreak) {
			nextGeneration();
			mustBreak = false;
			for (int i = 0; i < breakConditions.size() && !mustBreak; i++) {
				mustBreak = breakConditions.get(i).mustBreak(grid, newGrid, generationNumber);
			}

			grid = newGrid;
			drawGrid();

		}
		TimeControl.stopTimer();
		try {
			Log.endLog();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void nextGeneration() {
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
