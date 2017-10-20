package game;

public class GenerationConf2 extends PrimeGeneration implements Generation{
	public PrimeGeneration initGen() {
		PrimeGeneration retGen = GeneratePrimeGen(100);
		boolean even = false;
		boolean uneven = true;
//		TODO See if second boolean can be removed
		for (int row = 0; row < retGen.grid.length; row++) {
			for (int col = 0; col < retGen.grid[row].length; col++) {
				if ((row % 2) == 0) {
					if (even) {
						retGen.grid[row][col].live();
					} else {
						retGen.grid[row][col].die();
					}
					even = !even;
				} else {
					if (uneven) {
						retGen.grid[row][col].live();
					} else {
						retGen.grid[row][col].die();
					}
					uneven = !uneven;
				}
			}
		}
		retGen.drawGrid();
		return retGen;
	};

}
