package celltypes;

import java.util.ArrayList;
import java.util.List;

import game.Cells;

public class VonNeumannCell extends Cells {
	public VonNeumannCell(int posX, int posY) {
		super(posX, posY);
	}

	public List<Cells> neighbors() {
		ArrayList<Cells> neighbors = new ArrayList<>();

		neighbors.add(Grid.getCell(positionX, positionY - 1));
		neighbors.add(Grid.getCell(positionX, positionY + 1));
		neighbors.add(Grid.getCell(positionX - 1, positionY));
		neighbors.add(Grid.getCell(positionX + 1, positionY));

		return neighbors;
	}
}
