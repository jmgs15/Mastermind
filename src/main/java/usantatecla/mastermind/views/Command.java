package usantatecla.mastermind.views;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.utils.Console;

abstract class Command extends usantatecla.utils.Command {

	protected PlayController playController;

	protected Command(String title, PlayController playController) {
		super(title);
		this.playController = playController;
	}
	
	public void execute() {
		this.interact();
		this.showResults();
	}
	
	protected void showResults() {
		Console.instance().writeln();
		MessageView.ATTEMPTS.writeln(playController.getAttempts());
		new SecretCombinationView().writeln();
		for (int i = 0; i < playController.getAttempts(); i++) {
			new ProposedCombinationView(playController).write(i);
			new ResultView(playController).writeln(i);
		}
		if (playController.isWinner()) {
			MessageView.WINNER.writeln();
		} else if (playController.isLooser()) {
			MessageView.LOOSER.writeln();
		}
	}
}
