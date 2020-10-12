package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Game;

public class View {

	private Game game;
	private StartView startView;
	private PlayView playView;
	private ResumeView resumeView;

	public View() {
		startNewGame();
	}
	
	public void startNewGame() {
		this.game = new Game();
		this.startView = new StartView(this.game);
		this.playView = new PlayView(this.game);
		this.resumeView = new ResumeView();
	}

	public void interact() {
		do {
			startNewGame();
			this.startView.interact();
			this.playView.interact();
		} while (this.resumeView.interact());
	}

}