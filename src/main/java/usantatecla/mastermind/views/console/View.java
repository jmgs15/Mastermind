package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.controllers.StartController;

public class View extends usantatecla.mastermind.views.View {
	
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
		this.startView.interact();
	}

	@Override
	public void visit(ProposalController proposalController) {
		boolean finished;
		do {
			finished = this.proposalView.interact(proposalController);
		} while (!finished);
	}

	@Override
	public void visit(ResumeController resumeController) {
		this.resumeView.interact(resumeController);
	}

}
