package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.WithConsoleView;

class StartView extends WithConsoleView {

	private Logic logic;
	
	public StartView(Logic logic) {
		this.logic = logic;
	}
	
	void interact() {
		MessageView.TITLE.writeln();
		new SecretCombinationView(this.logic).writeln();
	}

}
