package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.views.MessageView;

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
