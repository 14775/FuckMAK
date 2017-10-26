package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import game.SuperGeneration;

public class ParityRulesTest {
	SuperGeneration gen;
	final int dimension = 4;
	final String celltype = "VonNeumann";

	@Before
	public void setUp() {
		gen = new SuperGeneration(dimension, "2DArray", 1, celltype);
	}

	/*
	 * tests getCell() and insertCell()
	 */
	@Test
	public void testParityRules() {

		gen.getGrid().getCell(1, 2).live();
		gen.nextGeneration();

		assertEquals(true, gen.getGrid().getCell(1, 1).isAlive());
		assertEquals(true, gen.getGrid().getCell(0, 2).isAlive());
		assertEquals(true, gen.getGrid().getCell(2, 2).isAlive());
		assertEquals(true, gen.getGrid().getCell(1, 3).isAlive());

		assertEquals(false, gen.getGrid().getCell(0, 0).isAlive());
		assertEquals(false, gen.getGrid().getCell(0, 1).isAlive());
		// assertEquals(false, gen.getGrid().getCell(0, 3).isAlive());
	}

}
