package gameModes;

public class Parity_Experiment_2_1 {

	public static void main(String[] args) {
		ParityConfig2 newGen = new ParityConfig2(200, "2DArray", 1, "VonNeumann");
		for (int i = 1; i <= 5; i++) {
			newGen.nextGeneration();
			newGen.drawGrid();
		}
	}
}
