package usantatecla.mastermind.views.console;

import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.WithConsoleView;

public class ResultView extends WithConsoleView {

	public void writeln(int blacks, int whites) {
		MessageView.RESULT.writeln(blacks, whites);
	}
}
