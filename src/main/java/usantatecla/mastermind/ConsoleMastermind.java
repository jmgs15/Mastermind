package usantatecla.mastermind;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.views.console.View;

public class ConsoleMastermind extends Mastermind {
	
	public static void main(String[] args) {
		new ConsoleMastermind().play();
	}

	@Override
	View createView(Logic logic) {
		return new View(logic);
	}	

}
