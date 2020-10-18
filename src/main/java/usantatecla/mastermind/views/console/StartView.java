package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.WithConsoleView;

class StartView extends WithConsoleView {

	void interact(ProposalController proposalController) {
		MessageView.TITLE.writeln();
		new SecretCombinationView(proposalController).writeln();
	}

}
