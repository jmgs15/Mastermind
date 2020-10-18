package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.WithConsoleView;

class StartView extends WithConsoleView {

	private ProposalController proposalController;
	
	public StartView(ProposalController proposalController) {
		this.proposalController = proposalController;
	}
	
	void interact() {
		MessageView.TITLE.writeln();
		new SecretCombinationView(this.proposalController).writeln();
	}

}
