package gridTypes;

public class GridFactory {	
	public GridFactory() {};
	public Grid createGrid(String gridType, int Dimension){
		switch(gridType){
		case "2DArray":
			return new Grid2DArray(Dimension);
		case "Hash":
			return new GridHash(Dimension);
		default:
			throw new IllegalArgumentException(
				"There is no matching Grid Type!");
		}
	}
}
