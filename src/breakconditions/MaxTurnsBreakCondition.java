package breakconditions;

import grid.types.Grid;

public class MaxTurnsBreakCondition implements IBreakCondition {
	private int maxTurns;

	public MaxTurnsBreakCondition(int maxTurns) {
		this.maxTurns = maxTurns;
	}

	public boolean mustBreak(Grid oldGrid, Grid newGrid, int turns) {
		return (turns >= maxTurns);
	}
}
