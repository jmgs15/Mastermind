package usantatecla.mastermind.controllers;

import java.util.List;

import usantatecla.mastermind.models.Color;
import usantatecla.mastermind.models.Error;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.Session;

public class ActionController extends Controller {

	ActionController(Session session) {
		super(session);
	}

	public int getBlacks(int position) {
		return this.session.getBlacks(position);
	}
	
	public int getWhites(int position) {
		return this.session.getWhites(position);
	}
	
	public List<Color> getColors(int position) {
		return this.session.getColors(position);
	}
	
	public boolean isLooser() {
		return this.session.isLooser();
	}
	
	public boolean isWinner() {
		return this.session.isWinner();
	}
	
	public void nextState() {
		this.session.nextState();
	}
	
	public void addProposedCombination(ProposedCombination proposedCombination) {
		this.session.addProposedCombination(proposedCombination);
	}
	
	public void addMemento() {
		this.session.addMemento();
	}
	
	public int getAttempts() {
		return this.session.getAttempts();
	}
	
	public Error isProposedCombinationValid(String characters) {
		return this.session.isProposedCombinationValid(characters);
	}
	
	public ProposedCombination getProposedCombination(String characters) {
		return this.session.getProposedCombination(characters);
	}

	public int getSecretCombinationWidth() {
		return this.session.getSecretCombinationWidth();
	}
}
