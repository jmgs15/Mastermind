package mastermind;

import utils.Console;

public class ProposedCombination extends Combination {

	void read(String message) {
		Console console = Console.instance();
		Error error;
		String entryInitialsCodePegs;
		do {
			entryInitialsCodePegs = console.readString(Message.PROPOSE_COMBINATION.toString());
			error = this.checkEntryCodeError(entryInitialsCodePegs);
			error.writeln();
		} while (error != Error.NULL_ERROR);
		this.putCodePegs(entryInitialsCodePegs);
	}
	
	Error checkEntryCodeError(String initialsCodePegs) {
		if (initialsCodePegs.length() != Combination.POSITIONS) {
			return Error.WRONG_LENGTH;
		}
		for (int i = 0; i < initialsCodePegs.length(); i++) {
			if (CodePeg.get(initialsCodePegs.charAt(i)) == CodePeg.NULL_CODE) {
				return Error.WRONG_COLOURS;
			}
		}
		return Error.NULL_ERROR;
	}
	
	void write() {
		for (int i = 0; i < this.codePegs.length; i++) {
			this.codePegs[i].write();
		}
	}
}
