package celltypes;

import java.util.ArrayList;
import java.util.List;

import game.Cells;

public class MooreCell extends Cells {
	public MooreCell(int posX, int posY) {
		super(posX, posY);
	}

	public List<Cells> neighbors() {
		ArrayList<Cells> neighbors = new ArrayList<>();
		for (int k = -1; k < 2; k++) {
			for (int l = -1; l < 2; l++) {
				if (k == 0 && l == 0)
					continue;
				neighbors.add(Grid.getCell(positionX - k, positionY - l));
			}
		}
		return neighbors;
	}
}
