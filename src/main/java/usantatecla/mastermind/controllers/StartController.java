package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public abstract class StartController extends AcceptorController {

    public StartController(Session session) {
		super(session);
	}

	@Override
	public void accept(ControllerVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}
	
	public abstract void nextState();
}
