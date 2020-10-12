package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Game;

public class PlayView {
	
	private Game game;

	PlayView(Game game) {
		this.game = game;
	}

  void interact() {
	  do {
			this.game.add(new ProposedCombinationView().read());
			new GameView(this.game).writeln();
		} while (!this.game.isFinished());
		Message message = Message.LOOSER;
		if (this.game.isWinner()){
			message = Message.WINNER;
		}
		message.writeln();
	}
}
