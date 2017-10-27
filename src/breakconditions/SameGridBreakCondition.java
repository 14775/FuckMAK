package breakconditions;

import grid.types.Grid;

public class SameGridBreakCondition implements IBreakCondition {
	public boolean mustBreak(Grid oldGrid, Grid newGrid, int turns) {
		boolean isSame = true;

		for (int i = 0; i < oldGrid.getGridDimension() && isSame; i++) {
			for (int j = 0; j < oldGrid.getGridDimension() && isSame; j++) {
				isSame = (oldGrid.getCell(i, j).isAlive() == newGrid.getCell(i, j).isAlive());
			}
		}

		return isSame;
	}
}
