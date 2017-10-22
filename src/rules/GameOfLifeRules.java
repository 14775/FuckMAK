package rules;

import game.Rules;

public class GameOfLifeRules implements Rules{
	
	public boolean mustStayAlive(int numberOfNeighbors) {
        return numberOfNeighbors == 2 || numberOfNeighbors == 3;

    }

    public boolean mustBeBorn(int numberOfNeighbors) {
        return numberOfNeighbors == 3;
    }
}
