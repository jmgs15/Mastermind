package usantatecla.mastermind.views;

import usantatecla.utils.WithConsoleView;

public class SecretCombinationView extends WithConsoleView {

	public void writeln(int combinationWidth) {
		for (int i = 0; i < combinationWidth; i++) {
			MessageView.SECRET.write();
		}
		this.console.writeln();
	}

}
