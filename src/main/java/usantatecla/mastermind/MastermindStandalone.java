package usantatecla.mastermind;

public class MastermindStandalone extends Mastermind {
	
	public static void main(String[] args) {
		new MastermindStandalone().play();
	}

	@Override
	protected boolean isStandalone() {
		return true;
	}
}
