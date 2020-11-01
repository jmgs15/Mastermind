package usantatecla.mastermind;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.controllers.implementation.LogicImplementation;

public class MastermindStandalone extends Mastermind {
	
	public static void main(String[] args) {
		new MastermindStandalone().play();
	}

	@Override
	protected Logic createLogic() {
		return new LogicImplementation();
	}
}
