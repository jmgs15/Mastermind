package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Game;

public abstract class View {

	protected Game game;

	public View(Game game) {
		this.game = game;
	}
	

	public void interact() {
		do {
			this.start();
			boolean finished;
			do {
				finished = this.play();
			} while (!finished);
		} while (this.isNewGame());
	}
	
	protected abstract void start();
	protected abstract boolean play();
	protected abstract boolean isNewGame();

}
