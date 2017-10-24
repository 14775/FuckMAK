package gridTypes;

import celltypes.MooreCell;
import celltypes.VonNeumannCell;
import game.Cells;

public class Grid2DArray implements Grid {
	protected Cells[][] grid;
	private int length;

	public Grid2DArray(int dimension, String cellType) {
		this.length = dimension;
		// this.grid = new Cells[dimension][dimension];
		// for (int row = 0; row < grid.length; row++) {
		// for (int col = 0; col < grid[row].length; col++) {
		// this.insertCell(row, col, new Cells(row, col));
		// }
		// }
		if (cellType == "Moore") {
			grid = new MooreCell[dimension][dimension];
			for (int row = 0; row < grid.length; row++) {
				for (int col = 0; col < grid[row].length; col++) {
					grid[row][col] = new MooreCell(row, col);
				}
			}
		}
		if (cellType == "vonNeumann") {
			grid = new VonNeumannCell[dimension][dimension];
			for (int row = 0; row < grid.length; row++) {
				for (int col = 0; col < grid[row].length; col++) {
					grid[row][col] = new VonNeumannCell(row, col);
				}
			}
		}
	}

	@Override
	public Cells getCell(int x, int y) {
		return this.grid[x][y];
	}

	@Override
	public void insertCell(int x, int y, Cells newCell) {
		this.grid[x][y] = newCell;
	}

	@Override
	public int getGridLength() {
		return this.length;
	}

};
