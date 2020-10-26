package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.models.Color;
import usantatecla.mastermind.models.Error;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.views.ErrorView;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.WithConsoleView;

class ProposedCombinationView extends WithConsoleView {
	
	private PlayController proposalController;

	ProposedCombinationView(PlayController proposalController) {
		this.proposalController = proposalController;
	}

	void write(int position) {
		for (Color color: this.proposalController.getColors(position)) {
			new ColorView().write(color);
		}
	}

	ProposedCombination read() {
		ProposedCombination proposedCombination = null;
		Error error;
		do {
			error = null;
			MessageView.PROPOSED_COMBINATION.write();
			String characters = this.console.readString();
			error = this.proposalController.isProposedCombinationValid(characters);
			if (error != null) {
				new ErrorView(error).writeln();
			} else {
				proposedCombination = this.proposalController.getProposedCombination(characters);
			}
		} while (error != null);
		return proposedCombination;
	}

}
