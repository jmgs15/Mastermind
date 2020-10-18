package usantatecla.mastermind;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.View;

public abstract class Mastermind {
	
	private Game game;
	private View view;
	private ProposalController proposalController;
	private ResumeController resumeController;
	

	protected Mastermind() {
		this.game = new Game();
		this.proposalController = new ProposalController(this.game);
		this.resumeController = new ResumeController(this.game);
		this.view = this.createView(this.proposalController, this.resumeController);
	}
	
	abstract View createView(ProposalController proposalController, ResumeController resumeController);

	protected void play() {
		this.view.interact();
	}

}
