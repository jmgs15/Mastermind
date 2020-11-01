package usantatecla.mastermind;

import usantatecla.mastermind.controllers.Controller;
import usantatecla.mastermind.controllers.Logic;

public abstract class Mastermind {
	
	private Logic logic;

	protected Mastermind() {
		this.logic = new Logic();
	}
	
	protected void play() {
		Controller controller;
		do {
			controller = this.logic.getController();
			if (controller != null) {
				controller.control();
			}
		} while (controller != null);
	}

}