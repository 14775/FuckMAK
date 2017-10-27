package grid.types;

/*
 * 
 */
public class GridFactory {
	/*
	 * 
	 */
	// TODO @Erik Uppercasing
	public Grid createGrid(String gridType, int dimension, String cellType) {
		switch (gridType.toUpperCase()) {
		case "2DARRAY":
			return new Grid2DArray(dimension, cellType);
		case "HASHMAP":
			return new GridHashMap(dimension, cellType);
		default:
			throw new IllegalArgumentException("There is no matching Grid Type!");
		}
	}
}
