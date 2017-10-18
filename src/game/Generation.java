package game;

public class Generation {
	private Cell[][] world;

	private Generation() {
	};

	public static Generation GenerationConf1() {
		Generation retGen = new Generation();
		retGen.world = new Cell[40][40];
		for (int row = 0; row < retGen.world.length; row++) {
			for (int col = 0; col < retGen.world[row].length; col++) {
				Cell newCell = new Cell(row, col);
				if (row == 18 | row == 19) {
					if (col == 18 | col == 19 | col == 21 | col == 22)
						newCell.lives();
				}
				if (row == 20) {
					if (col == 19 | col == 21) {
						newCell.lives();
					}
				}
				if (row == 21 | row == 22) {
					if (col == 17 | col == 19 | col == 21 | col == 23)
						newCell.lives();
				}
				if (row == 23) {
					if (col == 17 | col == 18 | col == 22 | col == 23) {
						newCell.lives();
					}
				}
				retGen.world[row][col] = newCell;
			}
		}
		retGen.drawWorld();
		return retGen;
	};

	public static Generation GenerationConf2() {
		Generation retGen = new Generation();
		retGen.world = new Cell[100][100];
		for (int row = 0; row < retGen.world.length; row++) {
			for (int col = 0; col < retGen.world[row].length; col++) {
				Cell newCell = new Cell(row, col);
				boolean even = false;
				boolean uneven = true;
				if (row % 2 == 0) {
					if (even == true) {
						newCell.lives();
					} else {
						newCell.dies();
					}
					even = !even;
				} else {
					if (uneven = true) {
						newCell.lives();
					} else {
						newCell.dies();
					}
				}
				;
				retGen.world[row][col] = newCell;
			}
		}
		retGen.drawWorld();
		return retGen;
	};

	public static Generation GenerationConf3() {
		Generation retGen = new Generation();
		retGen.world = new Cell[300][300];
		for (int row = 0; row < retGen.world.length; row++) {
			for (int col = 0; col < retGen.world[row].length; col++) {

				retGen.world[row][col] = new Cell(row, col);
			}
		}
		retGen.drawWorld();
		return retGen;
	};

	public void drawWorld() {
		for (int row = 0; row < world.length; row++) {
			for (int col = 0; col < world[row].length; col++) {
				System.out.print(world[row][col].isAlive() ? '1' : '0');
			}
			System.out.println();
		}
		// TODO Print out turn number
	}
}
