package mastermind;

import utils.Console;

public class Board {

	static final int MAX_PROPOSED_COMBINATIONS = 10;
	
	private SecretCombination secretCombination;
	private ProposedCombination[] proposedCombinations;
	private Result[] results;
	private int attempts;
	
	Board() {
		this.secretCombination = new SecretCombination();
		this.proposedCombinations = new ProposedCombination[MAX_PROPOSED_COMBINATIONS];
		this.results = new Result[MAX_PROPOSED_COMBINATIONS];
		this.attempts = 0;
	}
	
	void play() {
		Message.ATTEMPTS.writeln(this.attempts);
		this.secretCombination.write();
		ProposedCombination requestedProposedCombination = new ProposedCombination();
		requestedProposedCombination.read(Message.PROPOSE_COMBINATION.toString());
		this.putProposedCombination(requestedProposedCombination);
		this.putResult(requestedProposedCombination);
		this.addAttempt();
		this.writeResults();
		Console.instance().writeln();
	}
	
	void writeResults() {
		for (int i = 0; i < this.attempts; i++) {
			this.proposedCombinations[i].write();
			this.results[i].write();
		}
	}
	
	void putResult(ProposedCombination proposedCombination) {
		this.results[this.attempts] = this.secretCombination.resolveCombination(proposedCombination);
	}
	
	void putProposedCombination(ProposedCombination proposedCombination) {
		this.proposedCombinations[this.attempts] = proposedCombination;
	}
	
	boolean isProposedCombinationCorrect() {
		return this.results[this.attempts-1].isCombinationCorrect();
	}
	
	boolean isMaxAttemptsExceeded() {
		return this.attempts >= MAX_PROPOSED_COMBINATIONS;
	}
	
	void addAttempt() {
		this.attempts++;
	}
}
