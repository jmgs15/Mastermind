package usantatecla.mastermind.views;

import usantatecla.mastermind.controllers.PlayController;

public class PlayMenu extends Menu {

  PlayMenu(PlayController playController) {
    this.addCommand(new PlayCommand(playController));
    this.addCommand(new UndoCommand(playController));
    this.addCommand(new RedoCommand(playController));
  }

}
