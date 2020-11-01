package usantatecla.mastermind.views;

import usantatecla.utils.WithConsoleView;

public class StartView extends WithConsoleView {

	public void write(int combinationWidth) {
		MessageView.TITLE.writeln();
		new SecretCombinationView().writeln(combinationWidth);
	}

}
