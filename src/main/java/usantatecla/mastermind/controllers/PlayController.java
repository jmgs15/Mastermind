package usantatecla.mastermind.controllers;

import java.util.List;

import usantatecla.mastermind.models.Color;
import usantatecla.mastermind.models.Error;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.Session;

public abstract class PlayController extends AcceptorController {

	
	public static final char[] INITIALS = {'r', 'b', 'y', 'g', 'o', 'p'};

    public PlayController(Session session) {
		super(session);
	}

	public abstract int getBlacks(int position);
	
	public abstract int getWhites(int position);
	
	public abstract List<Color> getColors(int position);
	
	public abstract boolean isLooser();
	
	public abstract boolean isWinner();
	
	public abstract void addProposedCombination(String charCombination);
	
	public abstract int getAttempts();
	
	public abstract Error isProposedCombinationValid(String characters);
	
	public abstract ProposedCombination getProposedCombination(String characters);

	public abstract int getSecretCombinationWidth();
	
	public abstract boolean isGameFinished();
	
	public abstract boolean undoable();
	
	public abstract void undo();
	
	public abstract boolean redoable();
	
	public abstract void redo();
    
	@Override
	public void accept(ControllerVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}
}
