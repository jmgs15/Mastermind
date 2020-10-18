package usantatecla.mastermind;

import usantatecla.mastermind.views.console.View;

public class GraphicsMastermind extends Mastermind {
	
	@Override
	View createView() {
		return new View();
	}	
	
	public static void main(String[] args) {
		new GraphicsMastermind().play();
	}

}
