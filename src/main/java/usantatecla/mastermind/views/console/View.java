package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.Controller;
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
	public void interact(Controller controller) {
		if (controller instanceof ProposalController) {
			this.startView.interact((ProposalController) controller);
			boolean finished;
			do {
				finished = this.proposalView.interact((ProposalController) controller);
			} while (!finished);
		} else {
			this.resumeView.interact((ResumeController) controller);
		}
	}

}
