package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Session;

public class ResumeController extends Controller implements AcceptorController {

	public ResumeController(Session session) {
		super(session);
	}
	
	public void resume(boolean isResumed) {
		if (isResumed) {
			this.session.newGame();
		} else {
			this.session.nextState();
		}
		
	}

	@Override
	public void accept(ControllerVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}
}
