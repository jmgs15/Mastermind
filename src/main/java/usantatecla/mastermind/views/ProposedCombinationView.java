package usantatecla.mastermind.views;

import usantatecla.utils.WithConsoleView;

public class ProposedCombinationView extends WithConsoleView {
	
	public ProposedCombinationView() {}

	public void writeColor(char initial) {
		this.console.write(initial);
	}

	public String read() {
		MessageView.PROPOSED_COMBINATION.write();
		return this.console.readString();
	}

}
