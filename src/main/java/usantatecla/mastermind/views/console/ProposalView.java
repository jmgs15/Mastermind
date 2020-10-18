package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.WithConsoleView;

class ProposalView extends WithConsoleView {

	private Logic logic;

	ProposalView(Logic logic) {
		this.logic = logic;
	}

	boolean interact() {
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView(this.logic);
		this.logic.addProposedCombination(proposedCombinationView.read());
		this.console.writeln();
		MessageView.ATTEMPTS.writeln(this.logic.getAttempts());
		new SecretCombinationView(this.logic).writeln();
		for (int i = 0; i < this.logic.getAttempts(); i++) {
			new ProposedCombinationView(this.logic).write(i);
			new ResultView(this.logic).writeln(i);
		}
		if (this.logic.isWinner()) {
			MessageView.WINNER.writeln();
			return true;
		} else if (this.logic.isLooser()) {
			MessageView.LOOSER.writeln();
			return true;
		}
		return false;
	}

}
