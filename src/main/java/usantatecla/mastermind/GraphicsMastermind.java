package usantatecla.mastermind;

import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.views.console.View;

public class GraphicsMastermind extends Mastermind {

	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}

	@Override
	View createView(Game game) {
		return new View(game);
	}	

}
