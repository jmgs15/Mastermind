package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.SessionImplementation;

public class UndoController extends Controller {

	private SessionImplementation sessionImplementation;
	
	public UndoController(Session session) {
		super(session);
		this.sessionImplementation = ((SessionImplementation) this.session);
	}
	
	public boolean undoable() {
		return this.sessionImplementation.undoable();
	}
	
	public void undo() {
		this.sessionImplementation.undo();
	}

}
