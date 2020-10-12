package usantatecla.mastermind.models;

public class Game {

	private Board board;
	
	public Game() {
		this.board = new Board();
	}
	
	public boolean isFinished() {
		return this.board.isWinner() || this.board.isLooser();
	}

	public boolean isWinner() {
		return this.board.getResult(getAttempts() - 1).isWinner();
	}

	private boolean isLooser() {
		return this.board.getAttempts() == this.board.getMaxAttempts();
	}

	public int getAttempts() {
		return this.board.getAttempts();
	}

	public Result getResult(int index) {
		return this.board.getResult(index);
	}
	
	public void add(ProposedCombination proposedCombination) {
		this.board.add(proposedCombination);
	}
	
	public SecretCombination getSecretCombination() {
		return this.board.getSecretCombination();
	}
	
	public ProposedCombination getProposedCombination(int index) {
		return this.board.getProposedCombination(index);
	}
	
	public ProposedCombination[] getProposedCombinations() {
		return this.board.getProposedCombinations();
	}
}
