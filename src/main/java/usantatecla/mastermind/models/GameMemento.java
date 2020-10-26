package usantatecla.mastermind.models;

import java.util.List;

public class GameMemento extends Game {
	
	public GameMemento(Game game) {
		super(game);
	}
	
	public SecretCombination getSecretCombination() {
		return secretCombination;
	}

	public List<ProposedCombination> getProposedCombinations() {
		return proposedCombinations;
	}

	public List<Result> getResults() {
		return results;
	}

	public int getAttempts() {
		return attempts;
	}
	
}
