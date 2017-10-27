package grid.types;

import game.Cell;

public interface Grid {
	public Cell getCell(int x, int y);

	public void insertCell(int x, int y, Cell newCell);

	public int getGridDimension();

	public Grid cloneGrid();
}
