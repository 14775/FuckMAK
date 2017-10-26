package grid.types;

/*
 * 
 */
public class GridFactory {
	/*
	 * 
	 */
	public Grid createGrid(String gridType, int dimension, String cellType) {
		switch (gridType) {
		case "2DArray":
			return new Grid2DArray(dimension, cellType);
		case "HashMap":
			return new GridHashMap(dimension, cellType);
		default:
			throw new IllegalArgumentException("There is no matching Grid Type!");
		}
	}
}
