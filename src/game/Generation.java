package game;

public class Generation {
	private Cell[][] world;

	public Generation(int width) {
		world = new Cell[width][width];
		for (int row = 0; row < world.length; row++) {
			for (int col = 0; col < world[row].length; col++) {
				world[row][col] = new Cell(row, col);
			}
		}
		drawWorld();
	}

	public void drawWorld() {
		for (int row = 0; row < world.length; row++) {
			for (int col = 0; col < world[row].length; col++) {
				System.out.print(world[row][col].isAlive() ? '#' : '0');
			}
			System.out.println();
		}
//		TODO Print out turn number
	}
}
