package usantatecla.mastermind.controllers;

import usantatecla.mastermind.models.Color;
import usantatecla.mastermind.models.Error;
import usantatecla.mastermind.models.Game;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.SecretCombination;
import usantatecla.mastermind.models.State;
import usantatecla.mastermind.views.ErrorView;
import usantatecla.mastermind.views.MessageView;
import usantatecla.mastermind.views.ProposedCombinationView;
import usantatecla.mastermind.views.ResultView;
import usantatecla.mastermind.views.SecretCombinationView;
import usantatecla.utils.Console;

public class ProposalController extends Controller {
	
	public static final char[] INITIALS = {'r', 'b', 'y', 'g', 'o', 'p'};

	public ProposalController(Game game, State state) {
		super(game, state);
	}
	

	@Override
	public void control() {
		do {
			this.game.addProposedCombination(this.read());
			new Console().writeln();
			MessageView.ATTEMPTS.writeln(this.game.getAttempts());
			new SecretCombinationView().writeln(SecretCombination.getWidth());
			this.writeResults();
			if (this.game.isWinner()) {
				MessageView.WINNER.writeln();
			} else if (this.game.isLooser()) {
				MessageView.LOOSER.writeln();
			}
		} while (this.game.isGameFinished());
		this.nextState();
	}
	
	private ProposedCombination read() {
		ProposedCombination proposedCombination = new ProposedCombination();
		Error error;
		do {
			error = null;
			String characters = new ProposedCombinationView().read();
			error = proposedCombination.isProposedCombinationValid(characters);
			if (error != null) {
				new ErrorView(error).writeln();
			} else {
				proposedCombination.setProposedCombination(characters);
			}
		} while (error != null);
		return proposedCombination;
	}
	
	private void writeResults() {
		for (int i = 0; i < this.game.getAttempts(); i++) {
			for (Color color: this.game.getColors(i)) {
				new ProposedCombinationView().writeColor(ProposalController.INITIALS[color.ordinal()]);
			}
			new ResultView().writeln(this.game.getBlacks(i), this.game.getWhites(i));
		}
	}
}
