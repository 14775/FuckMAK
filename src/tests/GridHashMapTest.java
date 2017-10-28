package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

import celltypes.MooreCell;
import game.Cell;
import grid.types.Grid;
import grid.types.GridHashMap;
import settings.Neighborhood;

public class GridHashMapTest {
	Grid grid;
	final int dimension = 10;
	final Neighborhood celltype = Neighborhood.MOORE;

	@Before
	/*
	 * Creates a new HashMap based Grid
	 */
	public void setUp() {
		grid = new GridHashMap(dimension, celltype);
	}

	/*
	 * tests grid initialization and method getGridLenght()
	 */
	@Test
	public void dimensionCheck() {
		assertEquals(dimension, grid.getGridDimension());
	}

	/*
	 * tests getCell() and insertCell()
	 */
	@Test
	public void accessCellTest() {
		final int coordinate = 9;
		final int coordinate2 = 8;

		assertNotEquals(null, grid.getCell(coordinate, coordinate));

		Cell cell = mock(MooreCell.class);
		grid.insertCell(coordinate, coordinate, cell);
		assertEquals(cell, grid.getCell(coordinate, coordinate));

		cell = mock(MooreCell.class);
		grid.insertCell(coordinate2, coordinate2, cell);
		assertEquals(cell, grid.getCell(coordinate2, coordinate2));
	}

}
