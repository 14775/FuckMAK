package rules;

import game.Rules;
/*
 * Implements <<Rules>> and defines mustStayAlive and mustBeBorn for a certain cell
 * based on the number of its alive neighbors. Is used in XXX for "isAlive" Check...
*/

public class GameOfLifeRules implements Rules {

	public boolean mustStayAlive(int numberOfNeighbors) {
		return numberOfNeighbors == 2 || numberOfNeighbors == 3;

	}

	public boolean mustBeBorn(int numberOfNeighbors) {
		return numberOfNeighbors == 3;
	}
}
