package mastermind;

import utils.Console;

public class ProposedCombination extends Combination {

	void read(String message) {
		Console console = Console.instance();
		Error error;
		String entryInitialsColors;
		do {
			entryInitialsColors = console.readString(Message.PROPOSE_COMBINATION.toString());
			error = this.checkEntryCodeError(entryInitialsColors);
			error.writeln();
		} while (error != Error.NULL_ERROR);
		this.putCodePegs(entryInitialsColors);
	}
	
	Error checkEntryCodeError(String initialsColors) {
		if (initialsColors.length() != Combination.POSITIONS) {
			return Error.WRONG_LENGTH;
		}
		for (int i = 0; i < initialsColors.length(); i++) {
			if (Color.get(initialsColors.charAt(i)) == Color.NULL_CODE) {
				return Error.WRONG_COLOURS;
			}
		}
		return Error.NULL_ERROR;
	}
	
	void write() {
		for (int i = 0; i < this.colors.length; i++) {
			this.colors[i].write();
		}
	}
}
