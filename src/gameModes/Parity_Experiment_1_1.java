package gameModes;

public class Parity_Experiment_1_1 {

	public static void main(String[] args) {
		ParityConfig1 newGen = new ParityConfig1(400, "2DArray", 1, "VonNeumann");
		for (int i = 1; i <= 2; i++) {
			newGen.nextGeneration();
			newGen.drawGrid();
		}
	}
}
