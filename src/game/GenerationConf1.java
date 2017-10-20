package game;

public class GenerationConf1 extends PrimeGeneration implements Generation{

		public PrimeGeneration initGen() {
			PrimeGeneration retGen = GeneratePrimeGen(40);
			int row;
			int col;
			for (row = 18; row <= 23; row++) {
				for (col = 17; col <= 23; col++) {
					if (row == 18 || row == 19) {
						if (col == 18 || col == 19 || col == 21 || col == 22) {
							retGen.grid[row][col].live();
						}
					}
					if (row == 20) {
						if (col == 19 || col == 21) {
							retGen.grid[row][col].live();
						}
					}
					if (row == 21 || row == 22) {
						if (col == 17 || col == 19 || col == 21 || col == 23)
							retGen.grid[row][col].live();
					}
					if (row == 23) {
						if (col == 17 || col == 18 || col == 22 || col == 23)
							retGen.grid[row][col].live();
					}

				}
			}
			retGen.drawGrid();
			return retGen;
		};
}