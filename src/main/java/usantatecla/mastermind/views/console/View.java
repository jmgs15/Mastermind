package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.ResumeController;

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
	public void visit(ProposalController proposalController) {
		this.startView.interact(proposalController);
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
