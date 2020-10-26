package usantatecla.mastermind.models;

import java.util.List;

public class GameReal extends Game {

	public GameReal() {
		super();
	}
	
	public GameReal(Game game) {
		super(game);
	}

	public void addProposedCombination(ProposedCombination proposedCombination) {
		this.proposedCombinations.add(proposedCombination);
		this.results.add(this.secretCombination.getResult(proposedCombination));
		this.attempts++;
	}

	public boolean isLooser() {
		return this.attempts == GameReal.MAX_LONG;
	}
	
	public boolean isWinner() {
		return this.results.get(this.attempts-1).isWinner();
	}

	public int getAttempts() {
		return this.attempts;
	}

	public ProposedCombination getProposedCombination(int position) {
		return this.proposedCombinations.get(position);
	}
	
	public List<Color> getColors(int position) {
		return this.getProposedCombination(position).getColors();
	}

	public Result getResult(int position) {
		return this.results.get(position);
	}

	public int getBlacks(int position) {
		return this.getResult(position).getBlacks();
	}

	public int getWhites(int position) {
		return this.getResult(position).getBlacks();
	}
	
	public int getSecretCombinationWidth() {
		return Combination.getWidth();
	}
	
	public Error isProposedCombinationValid(String characters) {
		return new ProposedCombination().isProposedCombinationValid(characters);
	}
	
	public ProposedCombination getProposedCombination(String characters) {
		return new ProposedCombination().getProposedCombination(characters);
	}
	
	public GameMemento createMemento() {
		return new GameMemento(this);
	}

	public void set(GameMemento memento) {
		this.restore(memento);
	}
}
