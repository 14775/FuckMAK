package grid.types;

import com.rits.cloning.Cloner;

import celltypes.MooreCell;
import celltypes.VonNeumannCell;
import game.Cell;

public class Grid2DArray implements Grid {
	protected Cell[][] grid;
	private int dimension;

	public Grid2DArray(int dimension, String cellType) {
		this.dimension = dimension;
		if (cellType == "Moore") {
			grid = new MooreCell[dimension][dimension];
			for (int row = 0; row < dimension; row++) {
				for (int col = 0; col < dimension; col++) {
					grid[row][col] = new MooreCell(row, col);
				}
			}
		}
		if (cellType == "VonNeumann") {
			grid = new VonNeumannCell[dimension][dimension];
			for (int row = 0; row < dimension; row++) {
				for (int col = 0; col < dimension; col++) {
					grid[row][col] = new VonNeumannCell(row, col);
				}
			}
		}
	}

	@Override
	public Cell getCell(int x, int y) {
		return this.grid[x][y];
	}

	@Override
	public void insertCell(int x, int y, Cell newCell) {
		this.grid[x][y] = newCell;
	}

	@Override
	public int getGridDimension() {
		return this.dimension;
	}

	@Override
	public Grid cloneGrid() {
		Cloner cloner = new Cloner();
		return cloner.deepClone(this);
	}
}
