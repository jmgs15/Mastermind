package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Color;
import usantatecla.mastermind.models.Error;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.Result;
import usantatecla.utils.Console;

class ProposedCombinationView {

	ProposedCombination proposedCombination;
	
	ProposedCombinationView() {
		this.proposedCombination = new ProposedCombination();
	}
	
	ProposedCombinationView(ProposedCombination proposedCombination) {
		this.proposedCombination = proposedCombination;
	}

	void write() {
		for (Color color : this.proposedCombination.getColors()) {
			new ColorView(color).write();
		}
	}

	public ProposedCombination read() {
		Error error;
		do {
			Message.PROPOSED_COMBINATION.write();
			String entryProposedCombination = Console.instance().readString();
			error = this.checkError(entryProposedCombination);
			new ErrorView(error).writeln();
			this.proposedCombination = new ProposedCombination((new ColorView().getColors(entryProposedCombination)));
		} while (!error.isNull());
		
		return this.proposedCombination;
	}
	
	private Error checkError(String characters){
		if (characters.length() != Result.WIDTH) {
			return Error.WRONG_LENGTH;
		}
		for (int i = 0; i < characters.length(); i++) {
				Color color = new ColorView().getInstance(characters.charAt(i));
				if (color.isNull()) {
					return Error.WRONG_CHARACTERS;
				}
				for(int j=0; j<i; j++){
					if (this.proposedCombination.getColors().get(j) == color) {
						return Error.DUPLICATED;
					}
				}
				this.proposedCombination.getColors().add(color);
		}
		return Error.NULL_ERROR;
	}
}
