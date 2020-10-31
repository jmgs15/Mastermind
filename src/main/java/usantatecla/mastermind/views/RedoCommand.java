package usantatecla.mastermind.views;

import usantatecla.mastermind.controllers.PlayController;

class RedoCommand extends Command {

	RedoCommand(PlayController playController) {
		super(MessageView.REDO_COMMAND.getMessage(), playController);
	}

	@Override
	protected void interact() {
		this.playController.redo();
	}

	@Override
	public boolean isActive() {
		return this.playController.redoable();
	}

}
