package usantatecla.mastermind;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.console.View;

public class ConsoleMastermind extends Mastermind {
	
	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}

	@Override
	View createView(Game game) {
		return new View(game);
	}	

}
