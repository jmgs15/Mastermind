package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.WithConsoleView;

class ProposalView extends WithConsoleView {

	private ProposalController proposalController;
	private SecretCombinationView secretCombinationView;

	ProposalView(ProposalController proposalController) {
		this.proposalController = proposalController;
		this.secretCombinationView = new SecretCombinationView();
	}

	boolean interact() {
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView(proposalController);
		this.proposalController.addProposedCombination(proposedCombinationView.read());
		this.console.writeln();
		MessageView.ATTEMPTS.writeln(this.proposalController.getAttempts());
		this.secretCombinationView.writeln();
		for (int i = 0; i < this.proposalController.getAttempts(); i++) {
			new ProposedCombinationView(proposalController).write(i);
			new ResultView(proposalController).writeln(i);
		}
		if (this.proposalController.isWinner()) {
			MessageView.WINNER.writeln();
			return true;
		} else if (this.proposalController.isLooser()) {
			MessageView.LOOSER.writeln();
			return true;
		}
		return false;
	}

}
