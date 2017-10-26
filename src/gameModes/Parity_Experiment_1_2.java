package gameModes;

public class Parity_Experiment_1_2 {

	public static void main(String[] args) {
		ParityConfig1 newGen = new ParityConfig1(400, "HashMap", 1, "VonNeumann");
		for (int i = 1; i <= 5; i++) {
			newGen.nextGeneration();
			newGen.drawGrid();
		}
	}
}
