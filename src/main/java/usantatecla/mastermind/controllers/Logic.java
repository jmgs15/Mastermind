package usantatecla.mastermind.controllers;

import java.util.List;

import usantatecla.mastermind.models.Color;
import usantatecla.mastermind.models.Error;
import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.ProposedCombination;

public class Logic {

	private Game game;
	private ProposalController proposalController;
	private ResumeController resumeController;
	
	public Logic() {
		this.game = new Game();
		this.proposalController = new ProposalController(this.game);
		this.resumeController = new ResumeController(this.game);
	}
	
	public void clearGame() {
		this.resumeController.clearGame();
	}
	
	public int getBlacks(int position) {
		return this.proposalController.getBlacks(position);
	}
	
	public int getWhites(int position) {
		return this.proposalController.getWhites(position);
	}
	
	public List<Color> getColors(int position) {
		return this.proposalController.getColors(position);
	}
	
	public boolean isLooser() {
		return this.proposalController.isLooser();
	}
	
	public boolean isWinner() {
		return this.proposalController.isWinner();
	}
	
	public void addProposedCombination(ProposedCombination proposedCombination) {
		this.proposalController.addProposedCombination(proposedCombination);
	}
	
	public int getAttempts() {
		return this.proposalController.getAttempts();
	}
	
	public Error isProposedCombinationValid(String characters) {
		return this.proposalController.isProposedCombinationValid(characters);
	}
	
	public ProposedCombination getProposedCombination(String characters) {
		return this.proposalController.getProposedCombination(characters);
	}

	public int getSecretCombinationWidth() {
		return this.proposalController.getSecretCombinationWidth();
	}
}
