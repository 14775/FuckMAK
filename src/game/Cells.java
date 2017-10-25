package game;

import java.util.Collections;
import java.util.List;

public class Cells {
	protected int positionX;
	protected int positionY;
	private boolean alive;

	public Cells(int posX, int posY) {
		this.alive = false;
		this.positionX = posX;
		this.positionY = posY;
	}

	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public void live() {
		this.alive = true;
	}

	public void die() {
		this.alive = false;
	}

	public boolean isAlive() {
		return alive;
	}

	// Will be overwritten by MooreCell or VonNeuMannCell
	public List<Number> neighbors() {
		return Collections.emptyList();
	}

}