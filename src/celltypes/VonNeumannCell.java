package celltypes;

import java.util.ArrayList;
import java.util.List;

import game.Cells;

public class VonNeumannCell extends Cells {
	public VonNeumannCell(int posX, int posY) {
		super(posX, posY);
	}

	@Override
	public List<Number> neighbors() {
		ArrayList<Number> neighbors = new ArrayList<>();

		neighbors.add(positionX);
		neighbors.add((positionY - 1));
		neighbors.add(positionX);
		neighbors.add((positionY + 1));
		neighbors.add((positionX - 1));
		neighbors.add(positionY);
		neighbors.add((positionX + 1));
		neighbors.add(positionY);

		return neighbors;
	}
}
