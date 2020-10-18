package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.WithConsoleView;

class ResultView extends WithConsoleView {
	
	private Logic logic;

	public ResultView(Logic logic) {
		this.logic = logic;
	}

	void writeln(int position) {
		MessageView.RESULT.writeln(this.logic.getBlacks(position), this.logic.getWhites(position));
	}

}
