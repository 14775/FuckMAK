package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

import celltypes.MooreCell;
import game.Cell;
import grid.types.Grid;
import grid.types.Grid2DArray;

public class Grid2DArrayTest {
	Grid grid;
	final int dimension = 10;
	final String celltype = "Moore";

	@Before
	public void setUp() {
		grid = new Grid2DArray(dimension, celltype);
	}

	@Test
	public void dimensioncheck() {
		assertEquals(dimension, grid.getGridLength());
	}

	@Test
	public void accesscelltest() {
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
