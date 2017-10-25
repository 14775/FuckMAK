package gameModes;

public class GameOfLife3 {

	public static void main(String[] args) {
		GameOfLifeConfig3 newGen = new GameOfLifeConfig3(300, "HashMap", 0, "Moore");
		newGen.nextGeneration();
		newGen.drawGrid();
	}
}
