package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.WithConsoleView;

class ResultView extends WithConsoleView {
	
	private PlayController proposalController;

	public ResultView(PlayController proposalController) {
		this.proposalController = proposalController;
	}

	void writeln(int position) {
		MessageView.RESULT.writeln(this.proposalController.getBlacks(position), this.proposalController.getWhites(position));
	}

}
