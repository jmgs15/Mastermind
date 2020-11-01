package usantatecla.mastermind.controllers;

import java.util.List;

import usantatecla.mastermind.models.Color;
import usantatecla.mastermind.models.Error;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.SessionImplementation;

public class ActionController extends Controller {

	private SessionImplementation sessionImplementation;
	
	public ActionController(Session session) {
		super(session);
		this.sessionImplementation = ((SessionImplementation) this.session);
	}

	public int getBlacks(int position) {
		return this.sessionImplementation.getBlacks(position);
	}
	
	public int getWhites(int position) {
		return this.sessionImplementation.getWhites(position);
	}
	
	public List<Color> getColors(int position) {
		return this.sessionImplementation.getColors(position);
	}
	
	public boolean isLooser() {
		return this.sessionImplementation.isLooser();
	}
	
	public boolean isWinner() {
		return this.sessionImplementation.isWinner();
	}
	
	public void nextState() {
		this.sessionImplementation.nextState();
	}
	
	public void addProposedCombination(ProposedCombination proposedCombination) {
		this.sessionImplementation.addProposedCombination(proposedCombination);
	}
	
	public void addMemento() {
		this.sessionImplementation.addMemento();
	}
	
	public int getAttempts() {
		return this.sessionImplementation.getAttempts();
	}
	
	public Error isProposedCombinationValid(String characters) {
		return this.sessionImplementation.isProposedCombinationValid(characters);
	}
	
	public ProposedCombination getProposedCombination(String characters) {
		return this.sessionImplementation.getProposedCombination(characters);
	}

	public int getSecretCombinationWidth() {
		return this.sessionImplementation.getSecretCombinationWidth();
	}
}
