package rules;

import game.Rules;
/*
 * Implements <<Rules>> and defines mustStayAlive and mustBeBorn for a certain cell
 * based on the number of its alive neighbors. Is used in XXX for "isAlive" Check...
*/

public class ParityModelRules implements Rules {

	public boolean mustStayAlive(int numberOfAliveNeighbors) {
		return numberOfAliveNeighbors % 2 == 0;

	}

	public boolean mustBeBorn(int numberOfAliveNeighbors) {
		return numberOfAliveNeighbors % 2 == 0;
	}

}
