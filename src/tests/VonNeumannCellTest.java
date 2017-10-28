package tests;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import grid.types.Grid;
import grid.types.Grid2DArray;
import settings.Neighborhood;

public class VonNeumannCellTest {
	Grid grid;
	final int dimension = 10;
	final int checkpos = 5;
	final Neighborhood celltype = Neighborhood.VONNEUMANN;

	@Before
	/*
	 * Creates a Grid
	 */
	public void setUp() {
		grid = new Grid2DArray(dimension, celltype);
	}

	/*
	 * tests neighbors() for a cell at [5][5]
	 */
	@Test
	public void neighborsCheck() {
		assertEquals(dimension, grid.getGridDimension());
		List<Number> neighbors = grid.getCell(checkpos, checkpos).neighbors();
		assertEquals(neighbors.get(0), 5);
		assertEquals(neighbors.get(1), 4);
		assertEquals(neighbors.get(2), 5);
		assertEquals(neighbors.get(3), 6);
		assertEquals(neighbors.get(4), 4);
		assertEquals(neighbors.get(5), 5);
		assertEquals(neighbors.get(6), 6);
		assertEquals(neighbors.get(7), 5);
	}

}
