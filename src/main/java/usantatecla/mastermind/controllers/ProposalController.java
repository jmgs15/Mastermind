package usantatecla.mastermind.controllers;

import java.util.List;

import usantatecla.mastermind.models.Color;
import usantatecla.mastermind.models.Error;
import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.ProposedCombination;

public class ProposalController extends Controller {
	
	public static final char[] INITIALS = {'r', 'b', 'y', 'g', 'o', 'p'};

	public ProposalController(Game game) {
		super(game);
	}
	
	public int getBlacks(int position) {
		return this.game.getBlacks(position);
	}
	
	public int getWhites(int position) {
		return this.game.getWhites(position);
	}
	
	public List<Color> getColors(int position) {
		return this.game.getColors(position);
	}
	
	public boolean isLooser() {
		return this.game.isLooser();
	}
	
	public boolean isWinner() {
		return this.game.isWinner();
	}
	
	public void addProposedCombination(ProposedCombination proposedCombination) {
		this.game.addProposedCombination(proposedCombination);
	}
	
	public int getAttempts() {
		return this.game.getAttempts();
	}
	
	public Error isProposedCombinationValid(String characters) {
		return ProposedCombination.isProposedCombinationValid(characters);
	}
	
	public ProposedCombination getProposedCombination(String characters) {
		return ProposedCombination.getProposedCombination(characters);
	}

}
