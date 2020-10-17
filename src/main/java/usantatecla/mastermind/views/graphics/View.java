package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.models.Game;

public class View extends usantatecla.mastermind.views.View {

	PlayView playView;
	
	public View (Game game) {
		super(game);
		this.playView = new PlayView(game);
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
