package usantatecla.mastermind.controllers;

import java.util.HashMap;
import java.util.Map;

import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.StateValue;

public class Logic {

	protected Session session;
	protected Map<StateValue, AcceptorController> controllers;

	public Logic() {
		this.controllers = new HashMap<StateValue, AcceptorController>();
	}

	public AcceptorController getController() {
		return this.controllers.get(this.session.getValueState());
	}
}