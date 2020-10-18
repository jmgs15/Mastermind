package usantatecla.mastermind.views;

import usantatecla.mastermind.controllers.Logic;

public abstract class View {

	protected Logic logic;

	public View(Logic logic) {
		this.logic = logic;
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
