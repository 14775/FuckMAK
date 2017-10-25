package grid.types;

import java.util.HashMap;

import celltypes.MooreCell;
import celltypes.VonNeumannCell;
import game.Cell;

public class GridHashMap implements Grid {
	private int length;
	private HashMap<String, Cell> grid;

	public GridHashMap(int dimension, String cellType) {
		this.length = dimension;
		if (cellType == "Moore") {
			grid = new HashMap<>();
			for (int row = 0; row < dimension; row++) {
				for (int col = 0; col < dimension; col++) {
					this.grid.put(String.valueOf(row) + String.valueOf(col), new MooreCell(row, col));
				}

			}
		}
		if (cellType == "VonNeumann") {
			grid = new HashMap<>();
			for (int row = 0; row < dimension; row++) {
				for (int col = 0; col < dimension; col++) {
					this.grid.put(String.valueOf(row) + String.valueOf(col), new VonNeumannCell(row, col));
				}

			}
		}
	};

	@Override
	public Cell getCell(int row, int col) {
		return this.grid.get(String.valueOf(row) + String.valueOf(col));
	}

	@Override
	public void insertCell(int row, int col, Cell newCell) {
		this.grid.put(String.valueOf(row) + String.valueOf(col), newCell);
	}

	@Override
	public int getGridDimension() {
		return this.length;
	}

}
