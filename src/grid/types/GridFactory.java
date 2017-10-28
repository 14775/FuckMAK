package grid.types;

import settings.Datastructure;
import settings.Neighborhood;

/*
 * 
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
