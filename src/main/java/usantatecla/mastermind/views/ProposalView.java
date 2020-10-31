package usantatecla.mastermind.views;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.utils.WithConsoleView;

class ProposalView extends WithConsoleView {

	void interact(PlayController playController) {
		do {
			new PlayMenu(playController).execute();
		} while(!playController.isGameFinished());
	}

}
