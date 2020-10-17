package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.models.Game;

public class PlayView {

	Game game;
	
	public PlayView(Game game) {
		this.game = game;
	}
	
	public void start() {
		//START THE GAME
	}

	public boolean play() {
		//PLAY THE GAME
		return false;
	}

	public boolean isNewGame() {
		//DO YOU WANT TO PLAY AGAIN??
		return false;
	}

}
