package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public class UndoController extends Controller {

	UndoController(Session session) {
		super(session);
	}
	
	public boolean undoable() {
		return this.session.undoable();
	}
	
	public void undo() {
		this.session.undo();
	}

}
