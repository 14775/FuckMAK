package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import game.Controller;

public class ParityRulesTest {
	Controller gen;
	final int dimension = 4;
	final String celltype = "VonNeumann";

	@Before
	public void setUp() {
		gen = new Controller(dimension, "2DArray", 1, celltype);
	}

	/*
	 * tests rules by checking the expected cell states after the first run
	 */
	@Test
	public void testParityRules1() {
		gen.getGrid().getCell(1, 2).live();
		gen.nextGeneration();
		// alive cells after first run
		assertEquals(true, gen.getGrid().getCell(1, 1).isAlive());
		assertEquals(true, gen.getGrid().getCell(0, 2).isAlive());
		assertEquals(true, gen.getGrid().getCell(2, 2).isAlive());
		assertEquals(true, gen.getGrid().getCell(1, 3).isAlive());
		// dead cells after first run
		assertEquals(false, gen.getGrid().getCell(0, 0).isAlive());
		assertEquals(false, gen.getGrid().getCell(0, 1).isAlive());
		assertEquals(false, gen.getGrid().getCell(0, 3).isAlive());
		assertEquals(false, gen.getGrid().getCell(1, 0).isAlive());
		assertEquals(false, gen.getGrid().getCell(2, 0).isAlive());
		assertEquals(false, gen.getGrid().getCell(3, 0).isAlive());
		assertEquals(false, gen.getGrid().getCell(3, 1).isAlive());
		assertEquals(false, gen.getGrid().getCell(3, 2).isAlive());
		assertEquals(false, gen.getGrid().getCell(3, 3).isAlive());
	}

	/*
	 * tests rules by checking the expected cell states after the second run
	 */
	public void testParityRules2() {
		gen.nextGeneration();
		// alive cells after first run
		assertEquals(true, gen.getGrid().getCell(1, 1).isAlive());
		assertEquals(true, gen.getGrid().getCell(0, 2).isAlive());
		assertEquals(true, gen.getGrid().getCell(2, 2).isAlive());
		assertEquals(true, gen.getGrid().getCell(1, 3).isAlive());
		assertEquals(true, gen.getGrid().getCell(1, 0).isAlive());
		assertEquals(true, gen.getGrid().getCell(3, 2).isAlive());
		// dead cells after first run
		assertEquals(false, gen.getGrid().getCell(0, 0).isAlive());
		assertEquals(false, gen.getGrid().getCell(0, 1).isAlive());
		assertEquals(false, gen.getGrid().getCell(0, 3).isAlive());
		assertEquals(false, gen.getGrid().getCell(2, 0).isAlive());
		assertEquals(false, gen.getGrid().getCell(3, 0).isAlive());
		assertEquals(false, gen.getGrid().getCell(3, 1).isAlive());
		assertEquals(false, gen.getGrid().getCell(3, 3).isAlive());
	}

}
