package grid.types;

public class GridFactory {
	public GridFactory() {
	};

	public Grid createGrid(String gridType, int Dimension, String cellType) {
		switch (gridType) {
		case "2DArray":
			return new Grid2DArray(Dimension, cellType);
		case "HashMap":
			return new GridHashMap(Dimension, cellType);
		default:
			throw new IllegalArgumentException("There is no matching Grid Type!");
		}
	}
}
