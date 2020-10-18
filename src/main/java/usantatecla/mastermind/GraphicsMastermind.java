package usantatecla.mastermind;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.views.console.View;

public class GraphicsMastermind extends Mastermind {
	
	@Override
	View createView(ProposalController proposalController, ResumeController resumeController) {
		return new View(proposalController, resumeController);
	}	
	
	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}

}
