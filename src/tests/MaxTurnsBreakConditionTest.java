package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import game.Controller;
import grid.types.Grid;
import settings.Datastructure;
import settings.Neighborhood;

public class MaxTurnsBreakConditionTest {
	Grid grid;
	final int dimension = 3;
	final int maxturns = 5;
	final Neighborhood celltype = Neighborhood.MOORE;
	final Datastructure gridtype = Datastructure.ARRAY;
	static Controller controller;

	@Before
	/*
	 * Creates a Grid
	 */
	public void setUp() {
		controller = new Controller();
		controller.createGame(dimension, gridtype, 0, celltype, 0, maxturns);
		controller.getGrid().getCell(1, 0).live();
		controller.getGrid().getCell(1, 1).live();
		controller.getGrid().getCell(1, 2).live();
	}

	/*
	 * tests maxTurns
	 */
	@Test
	public void neighborsCheck() {
		controller.evolve();
		assertEquals(maxturns, controller.getGenerationNumber());

	}

}
