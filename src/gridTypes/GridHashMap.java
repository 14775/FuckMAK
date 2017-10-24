package gridTypes;

import game.Cells;

public class GridHashMap implements Grid {
	private int length;

	public GridHashMap(int Dimension, String cellType) {
		this.length = Dimension;
	};

	@Override
	public Cells getCell(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertCell(int x, int y, Cells newCell) {
		// TODO Auto-generated method stub
	}

	@Override
	public int getGridLength() {
		return this.length;
	}

}
