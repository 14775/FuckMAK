package game;

/*
 *  
*/
public interface Rules {
	public boolean mustStayAlive(int numberOfNeighbors);

	public boolean mustBeBorn(int numberOfNeighbors);
}
