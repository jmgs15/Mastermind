package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.State;
import usantatecla.mastermind.views.console.ResumeView;

public class ResumeController extends Controller {

	public ResumeController(Game game, State state) {
		super(game, state);
	}
	
	private void clearGame() {
		this.game.clear();
		this.state.reset();
	}

	@Override
	public void control() {
		boolean newGame = new ResumeView().read();
		if (newGame) {
			this.clearGame();
		}
	}
}
