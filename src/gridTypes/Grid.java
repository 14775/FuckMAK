package gridTypes;

import game.Cells;

public interface Grid {
	public Cells getCell(int x, int y);

	public void insertCell(int x, int y, Cells newCell);

	public int getGridLength();

	public String getGridType();
}
