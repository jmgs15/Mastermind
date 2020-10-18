package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.WithConsoleView;

class SecretCombinationView extends WithConsoleView {

	private ProposalController proposalController;
	
	SecretCombinationView(ProposalController proposalController) {
		super();
		this.proposalController = proposalController;
	}

	void writeln() {
		for (int i = 0; i < this.proposalController.getSecretCombinationWidth(); i++) {
			MessageView.SECRET.write();
		}
		this.console.writeln();
	}

}
