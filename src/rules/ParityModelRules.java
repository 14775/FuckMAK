package rules;

import game.Rules;
/*
 * Implements <<Rules>> and defines mustStayAlive and mustBeBorn for a certain cell
 * based on the number of its alive neighbors.
*/

public class ParityModelRules implements Rules {

	public boolean mustStayAlive(int numberOfNeighbors) {
		return numberOfNeighbors % 2 == 0;

	}

	public boolean mustBeBorn(int numberOfNeighbors) {
		return numberOfNeighbors % 2 == 0;
	}

}
