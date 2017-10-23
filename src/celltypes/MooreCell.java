package celltypes;

import java.util.ArrayList;
import java.util.List;

import game.Cells;

public class MooreCell extends Cells {
	public MooreCell(int posX, int posY) {
		super(posX, posY);
	}

	public List<Number> neighbors() {
		ArrayList<Number> neighbors = new ArrayList<>();
		for (int k = -1; k < 2; k++) {
			for (int l = -1; l < 2; l++) {
				if (k == 0 && l == 0)
					continue;
				neighbors.add((positionX - k));
				neighbors.add((positionY - l));
			}
		}
		return neighbors;
	}
}
