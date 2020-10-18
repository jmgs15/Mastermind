package usantatecla.mastermind;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.views.console.View;

public class GraphicsMastermind extends Mastermind {
	
	@Override
	View createView(Logic logic) {
		return new View(logic);
	}	
	
	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}

}
