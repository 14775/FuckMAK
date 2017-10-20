package game;

public class GenerationConf3 extends PrimeGeneration implements Generation{

	public PrimeGeneration initGen() {
		PrimeGeneration retGen = GeneratePrimeGen(300);
		retGen.drawGrid();
		return retGen;
}
