package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Game;

public class StartView {
	
	private Game game;

	StartView(Game game) {
		this.game = game;
	}

  void interact() {
	  Message.TITLE.writeln();
	  new GameView(this.game).writeln();
	}
 
}
