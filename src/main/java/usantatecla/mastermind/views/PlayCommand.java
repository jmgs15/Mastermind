package usantatecla.mastermind.views;

import usantatecla.mastermind.controllers.PlayController;

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
