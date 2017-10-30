package grid.types;

import settings.Datastructure;
import settings.Neighborhood;

/*
 * creates a specific grid, constructor is called by controller.
 */
public class GridFactory {
	/*
	 * 
	 */
	// TODO @Erik Uppercasing
	public Grid createGrid(Datastructure gridType, int dimension, Neighborhood cellType) {
		switch (gridType) {
		case ARRAY:
			return new Grid2DArray(dimension, cellType);
		case HASHMAP:
			return new GridHashMap(dimension, cellType);
		default:
			throw new IllegalArgumentException("There is no matching Grid Type!");
		}
	}
}
