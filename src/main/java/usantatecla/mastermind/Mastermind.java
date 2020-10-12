package usantatecla.mastermind;

import usantatecla.mastermind.views.View;

public class Mastermind {

	private View view;
	
	Mastermind() {
		this.view = new View();
	}
	
	public void play() {
		view.interact();
	}

	public static void main(String[] args) {
		new Mastermind().play();
	}

}
