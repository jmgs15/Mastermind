package usantatecla.mastermind.controllers.implementation;

import java.util.List;

import usantatecla.mastermind.controllers.ActionController;
import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.controllers.RedoController;
import usantatecla.mastermind.controllers.UndoController;
import usantatecla.mastermind.models.Color;
import usantatecla.mastermind.models.Error;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.Session;

public class PlayControllerImplementation extends PlayController {

	private ActionController actionController;
	private UndoController undoController;
	private RedoController redoController;

    public PlayControllerImplementation(Session session) {
		super(session);
		this.actionController = new ActionController(session);
		this.undoController = new UndoController(session);
		this.redoController = new RedoController(session);
	}

	public int getBlacks(int position) {
		return this.actionController.getBlacks(position);
	}
	
	public int getWhites(int position) {
		return this.actionController.getWhites(position);
	}
	
	public List<Color> getColors(int position) {
		return this.actionController.getColors(position);
	}
	
	public boolean isLooser() {
		return this.actionController.isLooser();
	}
	
	public boolean isWinner() {
		return this.actionController.isWinner();
	}
	
	public void addProposedCombination(String charCombination) {
		ProposedCombination proposedCombination = this.getProposedCombination(charCombination);
		this.actionController.addProposedCombination(proposedCombination);
		this.actionController.addMemento();
	}
	
	public int getAttempts() {
		return this.actionController.getAttempts();
	}
	
	public Error isProposedCombinationValid(String characters) {
		return this.actionController.isProposedCombinationValid(characters);
	}
	
	public ProposedCombination getProposedCombination(String characters) {
		return this.actionController.getProposedCombination(characters);
	}

	public int getSecretCombinationWidth() {
		return this.actionController.getSecretCombinationWidth();
	}
	
	public boolean isGameFinished() {
		if (this.actionController.isWinner() || this.actionController.isLooser()) {
			this.actionController.nextState();
			return true;
		}
		return false;
	}
	
	public boolean undoable() {
		return this.undoController.undoable();
	}
	
	public void undo() {
		this.undoController.undo();
	}
	
	public boolean redoable() {
		return this.redoController.redoable();
	}
	
	public void redo() {
		this.redoController.redo();
	}

}
