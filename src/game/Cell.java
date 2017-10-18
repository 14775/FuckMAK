package game;

public class Cell {
	protected int positionX;
	protected int positionY;
	private boolean alive;
	
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
	
	public Cell(int posX, int posY){
		this.alive = false;
		this.positionX = posX;
		this.positionY = posY;
	};
	
	public void lives(){
		this.alive = true;
	}
	
	public void dies(){
		this.alive = false;
	}
	
	public boolean isAlive(){
		return alive;
	}
	
}
