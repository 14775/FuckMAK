package gameModes;

public class GameOfLife2 {

	public static void main(String[] args) {
		GameOfLifeConfig2 newGen = new GameOfLifeConfig2(100, "HashMap", 0, "Moore");
		for (int i = 1; i <= 100; i++) {
			newGen.nextGeneration();
			newGen.drawGrid();
		}
	}
}
