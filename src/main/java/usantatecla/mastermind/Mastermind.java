package usantatecla.mastermind;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.View;

public abstract class Mastermind {
	
	private Game game;
	private View view;
	

	protected Mastermind() {
		this.game = new Game();
		this.view = this.createView(this.game);
	}
	
	abstract View createView(Game game);

	protected void play() {
		this.view.interact();
	}

}
