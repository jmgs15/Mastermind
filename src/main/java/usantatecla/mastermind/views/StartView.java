package usantatecla.mastermind.views.console;

import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.WithConsoleView;

class StartView extends WithConsoleView {

	void interact() {
		MessageView.TITLE.writeln();
		new SecretCombinationView().writeln();
	}

}
