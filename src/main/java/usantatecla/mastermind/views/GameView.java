package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Game;
import usantatecla.utils.Console;

public class GameView {

	Game game;

	GameView(Game game) {
		this.game = game;
	}

	public void writeln() {
		Console.instance().writeln();
		Message.ATTEMPTS.writeln(this.game.getAttempts());
		new SecretCombinationView(this.game.getSecretCombination()).writeln();
		for (int i = 0; i < this.game.getAttempts(); i++) {
			new ProposedCombinationView(this.game.getProposedCombination(i)).write();
			new ResultView(this.game.getResult(i)).writeln();
		}
	}
}
