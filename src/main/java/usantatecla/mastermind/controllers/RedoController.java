package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public class RedoController extends Controller {

	RedoController(Session session) {
		super(session);
	}

	public boolean redoable() {
		return this.session.redoable();
	}
	
	public void redo() {
		this.session.redo();
	}
}
