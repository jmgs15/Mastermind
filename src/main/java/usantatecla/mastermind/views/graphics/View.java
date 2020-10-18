package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.ResumeController;

public class View extends usantatecla.mastermind.views.View {

	PlayView playView;
	
	public View (ProposalController proposalController, ResumeController resumeController) {
		super(proposalController, resumeController);
		this.playView = new PlayView(proposalController, resumeController);
	}
	
	@Override
	protected void start() {
		this.playView.start();
	}

	@Override
	protected boolean play() {
		return this.playView.play();
	}

	@Override
	protected boolean isNewGame() {
		return this.playView.isNewGame();
	}

}
