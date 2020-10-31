package usantatecla.mastermind.distributed;

import usantatecla.mastermind.Mastermind;

public class MastermindClient extends Mastermind {

	public static void main(String[] args) {
		new MastermindClient().play();
	}

	@Override
	protected boolean isStandalone() {
		return false;
	}

}
