package mastermind;

import utils.YesNoDialog;

public class MasterMind {

	Board board;
	
	private void play() {
		do {
			this.playGame();
		} while(this.isResumedGame());
	}
	
	private void playGame() {
		Message.TITTLE.writeln();
		this.board = new Board();
		do {
			this.board.play();
		} while (!this.board.isProposedCombinationCorrect() && !this.board.isMaxAttemptsExceeded());
		
		if (this.board.isProposedCombinationCorrect()) {
			Message.PLAYER_WIN.writeln();
		} else {
			Message.PLAYER_LOOSE.writeln();
		}
	}

	private boolean isResumedGame() {
		return new YesNoDialog().read(Message.RESUME.toString());

	}

	public static void main(String[] args) {
		new MasterMind().play();
	}

}
