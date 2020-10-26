package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public class StartController extends Controller implements AcceptorController {

	StartController(Session session) {
		super(session);
	}

	@Override
	public void accept(ControllerVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}
	
	public void nextState() {
		this.session.nextState();
	}
}
