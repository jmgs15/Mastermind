package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.views.MessageView;

class PlayCommand extends Command {

	PlayCommand(PlayController playController) {
		super(MessageView.ACTION_COMMAND.getMessage(), playController);
	}

	@Override
	protected void interact() {
		ProposedCombinationView proposedCombinationView = new ProposedCombinationView(playController);
		playController.addProposedCombination(proposedCombinationView.read());
	}

	@Override
	public boolean isActive() {
		return true;
	}

}
