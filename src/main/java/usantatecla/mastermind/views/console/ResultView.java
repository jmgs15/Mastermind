package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.WithConsoleView;

class ResultView extends WithConsoleView {
	
	private ProposalController proposalController;

	public ResultView(ProposalController proposalController) {
		this.proposalController = proposalController;
	}

	void writeln(int position) {
		MessageView.RESULT.writeln(this.proposalController.getBlacks(position), this.proposalController.getWhites(position));
	}

}
