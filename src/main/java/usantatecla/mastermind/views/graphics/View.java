package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.controllers.AcceptorController;
import usantatecla.mastermind.controllers.ControllerVisitor;
import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.controllers.StartController;

public class View extends usantatecla.mastermind.views.View implements ControllerVisitor {

	PlayView playView;
	
	public View () {
		this.playView = new PlayView();
	}
	
	@Override
	public void visit(StartController startController) {
		this.playView.interact(startController);
	}

	@Override
	public void visit(PlayController proposalController) {
		this.playView.interact(proposalController);
	}

	@Override
	public void visit(ResumeController resumeController) {
		this.playView.interact(resumeController);
	}

	@Override
	public void interact(AcceptorController acceptorController) {
		acceptorController.accept(this);
		
	}
	
}
