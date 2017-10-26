package gameModes;

public class Parity_Experiment_2_2 {

	public static void main(String[] args) {
		ParityConfig2 newGen = new ParityConfig2(200, "HashMap", 1, "VonNeumann");
		for (int i = 1; i <= 100; i++) {
			newGen.nextGeneration();
			newGen.drawGrid();
		}
	}
}