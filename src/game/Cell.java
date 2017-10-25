package game;

import java.util.List;

public interface Cell {
	public List<Number> neighbors();

	public boolean isAlive();

	public void live();

	public void die();
}
