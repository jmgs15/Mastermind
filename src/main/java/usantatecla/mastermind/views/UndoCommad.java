package usantatecla.mastermind.views;

import usantatecla.mastermind.controllers.PlayController;

class UndoCommand extends Command {

	UndoCommand(PlayController playController) {
		super(MessageView.UNDO_COMMAND.getMessage(), playController);
	}

	protected void interact() {
		this.playController.undo();
	}

	public boolean isActive() {
		return this.playController.undoable();
	}

}
