package usantatecla.mastermind.controllers;

import java.util.List;

import usantatecla.mastermind.distributed.dispatchers.FrameType;
import usantatecla.mastermind.distributed.dispatchers.TCPIP;
import usantatecla.mastermind.models.Color;
import usantatecla.mastermind.models.Error;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.Session;

public class PlayController extends AcceptorController {
	
	private ActionController actionController;
	private UndoController undoController;
	private RedoController redoController;
	
	public static final char[] INITIALS = {'r', 'b', 'y', 'g', 'o', 'p'};

    public PlayController(Session session, TCPIP tcpip) {
		super(session, tcpip);
		if (this.tcpip == null) {
			this.actionController = new ActionController(session);
			this.undoController = new UndoController(session);
			this.redoController = new RedoController(session);
		}
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
		if (this.tcpip == null) {
			ProposedCombination proposedCombination = this.getProposedCombination(charCombination);
			this.actionController.addProposedCombination(proposedCombination);
			this.actionController.addMemento();
		} else {
			this.tcpip.send(FrameType.ADD_COMBINATION.name().concat("#").concat(charCombination));
		}
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
		if (this.tcpip == null) {
			this.undoController.undo();
		} else {
			this.tcpip.send(FrameType.UNDO.name());
		}
	}
	
	public boolean redoable() {
		return this.redoController.redoable();
	}
	
	public void redo() {
		if (this.tcpip == null) {
			this.redoController.redo();
		} else {
			this.tcpip.send(FrameType.REDO.name());
		}
	}
	
	@Override
	public void accept(ControllerVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}
}
