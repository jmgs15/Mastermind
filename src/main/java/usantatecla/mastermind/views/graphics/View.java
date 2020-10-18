package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.ResumeController;

public class View extends usantatecla.mastermind.views.View {

	PlayView playView;
	
	public View () {
		this.playView = new PlayView();
	}

	@Override
	public void visit(ProposalController proposalController) {
		this.playView.interact(proposalController);
	}

	@Override
	public void visit(ResumeController resumeController) {
		this.playView.interact(resumeController);
	}
	
}
