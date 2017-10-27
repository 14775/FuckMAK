package gameModes;

import game.Controller;

public class ParityConfig1 extends Controller {

	public ParityConfig1(int dimension, String gridType, int rule, String cellType) {
		super(dimension, gridType, rule, cellType);
		int cellpos;
		cellpos = ((dimension - 2) / 2) + 1;
		this.grid.getCell(cellpos, cellpos).live();
		this.grid.getCell(cellpos, cellpos + 1).live();
		this.grid.getCell(cellpos + 1, cellpos).live();
		this.grid.getCell(cellpos + 1, cellpos + 1).live();

		this.drawGrid();
	}
}
