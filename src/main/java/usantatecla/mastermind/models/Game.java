package usantatecla.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Game {

	protected static final int MAX_LONG = 10;

	protected SecretCombination secretCombination;

	protected List<ProposedCombination> proposedCombinations;

	protected List<Result> results;

	protected int attempts;
	
	public Game() {
		this.clear();
	}
	
	public Game(Game game) {
		this.restore(game);
	}
	
	public void restore(Game game) {
		this.secretCombination = game.secretCombination;
		this.proposedCombinations = game.proposedCombinations;
		this.results = game.results;
		this.attempts = game.attempts;
	}

	public void clear() {
		this.secretCombination = new SecretCombination();
		this.proposedCombinations = new ArrayList<ProposedCombination>();
		this.results = new ArrayList<Result>();
		this.attempts = 0;
	}
}
