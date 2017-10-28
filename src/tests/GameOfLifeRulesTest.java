package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import game.Controller;
import settings.Datastructure;
import settings.Neighborhood;

public class GameOfLifeRulesTest {
	Controller gen;
	final int dimension = 5;
	final Neighborhood celltype = Neighborhood.MOORE;

	@Before
	public void setUp() {
		gen = new Controller();
		gen.createGame(dimension, Datastructure.ARRAY, 0, celltype, 0);

	}

	/*
	 * tests rules by checking the expected cell states after the first run
	 */
	@Test
	public void gameOfLifeTest1() {
		gen.getGrid().getCell(1, 2).live();
		gen.getGrid().getCell(2, 2).live();
		gen.getGrid().getCell(2, 1).live();
		gen.getGrid().getCell(3, 3).live();
		gen.nextGeneration();
		// alive cells after first run
		assertEquals(true, gen.getGrid().getCell(1, 1).isAlive());
		assertEquals(true, gen.getGrid().getCell(2, 1).isAlive());
		assertEquals(true, gen.getGrid().getCell(2, 2).isAlive());
		assertEquals(true, gen.getGrid().getCell(1, 2).isAlive());
		assertEquals(true, gen.getGrid().getCell(2, 3).isAlive());
		assertEquals(true, gen.getGrid().getCell(3, 2).isAlive());

		// dead cells after first run
		assertEquals(false, gen.getGrid().getCell(3, 3).isAlive());

	}

	/*
	 * tests rules by checking the expected cell states after the second run
	 */
	public void gameOfLifeTest2() {

		gen.nextGeneration();
		// alive cells after first run
		assertEquals(true, gen.getGrid().getCell(1, 1).isAlive());
		assertEquals(true, gen.getGrid().getCell(2, 1).isAlive());
		assertEquals(true, gen.getGrid().getCell(2, 2).isAlive());
		assertEquals(true, gen.getGrid().getCell(1, 2).isAlive());
		assertEquals(true, gen.getGrid().getCell(2, 3).isAlive());
		assertEquals(true, gen.getGrid().getCell(3, 2).isAlive());
		assertEquals(true, gen.getGrid().getCell(3, 3).isAlive());
		assertEquals(true, gen.getGrid().getCell(1, 3).isAlive());
		assertEquals(true, gen.getGrid().getCell(3, 1).isAlive());

	}

}
