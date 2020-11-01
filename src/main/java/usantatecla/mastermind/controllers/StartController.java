package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.SecretCombination;
import usantatecla.mastermind.models.State;
import usantatecla.mastermind.views.StartView;

public class StartController extends Controller {

	StartController(Game game, State state) {
		super(game, state);
	}

	@Override
	public void control() {
		new StartView().write(SecretCombination.getWidth());
		this.nextState();
	}
}
