package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.WithConsoleView;

class ProposalView extends WithConsoleView {

	boolean interact(ProposalController proposalController) {
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposalController);
		proposalController.addProposedCombination(proposedCombinationView.read());
		this.console.writeln();
		MessageView.ATTEMPTS.writeln(proposalController.getAttempts());
		new SecretCombinationView(proposalController).writeln();
		for (int i = 0; i < proposalController.getAttempts(); i++) {
			new ProposedCombinationView(proposalController).write(i);
			new ResultView(proposalController).writeln(i);
		}
		if (proposalController.isWinner()) {
			MessageView.WINNER.writeln();
			return true;
		} else if (proposalController.isLooser()) {
			MessageView.LOOSER.writeln();
			return true;
		}
		return false;
	}

}
