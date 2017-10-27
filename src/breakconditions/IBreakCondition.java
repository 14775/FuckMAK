package breakconditions;

import grid.types.Grid;

/*
 *  
*/
public interface IBreakCondition {
	public boolean mustBreak(Grid oldGrid, Grid newGrid, int turns);
}
