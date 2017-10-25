package gameModes;

public class GameOfLife1 {
	public static void main(String[] args) {
		GameOfLifeConfig1 newGen = new GameOfLifeConfig1(40, "2DArray", 0, "Moore");
		for (int i = 1; i <= 50; i++) {
			newGen.nextGeneration();
			newGen.drawGrid();
		}
	}

}