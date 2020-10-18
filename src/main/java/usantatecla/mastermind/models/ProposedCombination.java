package usantatecla.mastermind.models;

import java.util.List;

public class ProposedCombination extends Combination {

	boolean contains(Color color, int position) {
		return this.colors.get(position) == color;
	}

	boolean contains(Color color) {
		for (int i = 0; i < this.colors.size(); i++) {
			if (this.colors.get(i) == color) {
				return true;
			}
		}
		return false;
	}

	public List<Color> getColors() {
		return this.colors;
	}
	
	public static Error isProposedCombinationValid(String characters) {
		Error error = null;
		ProposedCombination proposedCombination = new ProposedCombination();
		if (characters.length() > Combination.getWidth()) {
			error = Error.WRONG_LENGTH;
		} else {
			for (int i = 0; i < characters.length(); i++) {
				Color color = Color.getInstance(characters.charAt(i));
				if (color == null) {
					error = Error.WRONG_CHARACTERS;
				} else {
					if (proposedCombination.getColors().contains(color)) {
						error = Error.DUPLICATED;
					} else {
						proposedCombination.getColors().add(color);
					}
				}
			}
		}
		return error;
	}
	
	public static ProposedCombination getProposedCombination(String characters) {
		ProposedCombination proposedCombination = new ProposedCombination();
		for (int i = 0; i < characters.length(); i++) {
			Color color = Color.getInstance(characters.charAt(i));
			proposedCombination.getColors().add(color);
		}
		return proposedCombination;
	}
}
