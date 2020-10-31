package usantatecla.mastermind.views;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.models.Color;
import usantatecla.mastermind.models.Error;
import usantatecla.utils.WithConsoleView;

class ProposedCombinationView extends WithConsoleView {
	
	private PlayController playController;

	ProposedCombinationView(PlayController proposalController) {
		this.playController = proposalController;
	}

	void write(int position) {
		for (Color color: this.playController.getColors(position)) {
			new ColorView().write(color);
		}
	}

	String read() {
		Error error;
		String characters = "";
		do {
			error = null;
			MessageView.PROPOSED_COMBINATION.write();
			characters = this.console.readString();
			error = this.playController.isProposedCombinationValid(characters);
			if (error != null) {
				new ErrorView(error).writeln();
			}
		} while (error != null);
		return characters;
	}

}
