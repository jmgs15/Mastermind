package usantatecla.mastermind;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.views.console.View;

public class ConsoleMastermind extends Mastermind {
	
	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}

	@Override
	View createView(ProposalController proposalController, ResumeController resumeController) {
		return new View(proposalController, resumeController);
	}	

}
