package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.controllers.Logic;

public class View extends usantatecla.mastermind.views.View {

	PlayView playView;
	
	public View (Logic logic) {
		super(logic);
		this.playView = new PlayView(logic);
	}
	
	@Override
	protected void start() {
		this.playView.start();
	}

	@Override
	protected boolean play() {
		return this.playView.play();
	}

	@Override
	protected boolean isNewGame() {
		return this.playView.isNewGame();
	}

}
