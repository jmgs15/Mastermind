package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.YesNoDialog;

class ResumeView {

	private ResumeController resumeController;

	ResumeView(ResumeController resumeController) {
		this.resumeController = resumeController;
	}

	boolean interact() {
		MessageView.RESUME.write();
		boolean newGame = new YesNoDialog().read();
		if (newGame) {
			this.resumeController.clearGame();
		}
		return newGame;
	}

}
