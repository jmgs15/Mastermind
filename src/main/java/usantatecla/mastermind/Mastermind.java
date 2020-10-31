package usantatecla.mastermind;

import usantatecla.mastermind.controllers.AcceptorController;
import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.views.View;

public abstract class Mastermind {
	
	private Logic logic;
	private View view;

	protected Mastermind() {
		this.logic = new Logic(this.isStandalone());
		this.view = new View();
	}
	
	protected abstract boolean isStandalone();

	protected void play() {
		AcceptorController controller;
		do {
			controller = this.logic.getController();
			if (controller != null) {
				this.view.interact(controller);
			}
		} while (controller != null);
		if (!this.isStandalone()) {
			this.logic.close();
		}
	}

}