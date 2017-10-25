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

public class gridTest {
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

		assertNotEquals(null, grid.getCell(9, 9));

		Cell cell = mock(MooreCell.class);
		grid.insertCell(9, 9, cell);
		assertEquals(cell, grid.getCell(9, 9));

		cell = mock(MooreCell.class);
		grid.insertCell(8, 8, cell);
		assertEquals(cell, grid.getCell(8, 8));
	}

}
