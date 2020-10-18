package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.YesNoDialog;

class ResumeView {

	boolean interact(ResumeController resumeController) {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if (newGame) {
			resumeController.clearGame();
		}
		return newGame;
	}

}
