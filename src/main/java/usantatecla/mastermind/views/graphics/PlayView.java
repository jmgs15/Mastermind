package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.ResumeController;

public class PlayView {

	private ProposalController proposalController;
	private ResumeController resumeController;
	
	public PlayView(ProposalController proposalController, ResumeController resumeController) {
		this.proposalController = proposalController;
		this.resumeController = resumeController;
	}
	
	public void start() {
		//START THE GAME
	}

	public boolean play() {
		//PLAY THE GAME
		return false;
	}

	public boolean isNewGame() {
		//DO YOU WANT TO PLAY AGAIN??
		return false;
	}

}
