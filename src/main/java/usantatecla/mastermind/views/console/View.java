package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.ResumeController;

public class View extends usantatecla.mastermind.views.View {
	
	private StartView startView;
	private ProposalView proposalView;
	private ResumeView resumeView;
	
	public View(ProposalController proposalController, ResumeController resumeController) {
		super(proposalController, resumeController);
		this.startView = new StartView();
		this.proposalView = new ProposalView(proposalController);
		this.resumeView = new ResumeView(resumeController);
	}

	@Override
	protected void start() {
		this.startView.interact();
	}

	@Override
	protected boolean play() {
		return this.proposalView.interact();
	}

	@Override
	protected boolean isNewGame() {
		return this.resumeView.interact();
	}

}
