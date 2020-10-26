package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.AcceptorController;
import usantatecla.mastermind.controllers.ControllerVisitor;
import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.controllers.StartController;

public class View extends usantatecla.mastermind.views.View implements ControllerVisitor {
	
	private StartView startView;
	private ProposalView proposalView;
	private ResumeView resumeView;
	
	public View() {
		this.startView = new StartView();
		this.proposalView = new ProposalView();
		this.resumeView = new ResumeView();
	}
	
	@Override
	public void visit(StartController startController) {
		this.startView.interact(startController);
	}

	@Override
	public void visit(PlayController proposalController) {
		this.proposalView.interact(proposalController);
	}

	@Override
	public void visit(ResumeController resumeController) {
		this.resumeView.interact(resumeController);
	}

	@Override
	public void interact(AcceptorController acceptorController) {
		acceptorController.accept(this);
		
	}

}
