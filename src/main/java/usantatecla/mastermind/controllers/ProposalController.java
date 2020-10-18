package usantatecla.mastermind.controllers;

import java.util.List;

import usantatecla.mastermind.models.Color;
import usantatecla.mastermind.models.Error;
import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.State;

public class ProposalController extends Controller {
	
	public static final char[] INITIALS = {'r', 'b', 'y', 'g', 'o', 'p'};

	public ProposalController(Game game, State state) {
		super(game, state);
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
		boolean isLooser = this.game.isLooser();
		if (isLooser) {
			this.state.next();
		}
		return isLooser;
	}
	
	public boolean isWinner() {
		boolean isWinner = this.game.isWinner(); 
		if (isWinner) {
			this.state.next();
		}
		return isWinner;
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

	public int getSecretCombinationWidth() {
		return this.game.getSecretCombinationWidth();
	}

	@Override
	public void accept(ControllersVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}
}
