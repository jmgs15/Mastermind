package usantatecla.mastermind.views;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.ResumeController;

public abstract class View {

	protected ProposalController proposalController;
	protected ResumeController resumeController;

	public View(ProposalController proposalController, ResumeController resumeController) {
		this.proposalController = proposalController;
		this.resumeController = resumeController;
	}

	public void interact() {
		do {
			this.start();
			boolean finished;
			do {
				finished = this.play();
			} while (!finished);
		} while (this.isNewGame());
	}
	
	protected abstract void start();
	protected abstract boolean play();
	protected abstract boolean isNewGame();

}
