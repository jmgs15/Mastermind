package mastermind;

import java.util.Random;

public class SecretCombination extends Combination {
	
	SecretCombination() {
		Random random = new Random(System.currentTimeMillis());
		
		for (int i = 0; i < this.colors.length; i++) {
			this.colors[i] = Color.get(random.nextInt(Color.values().length - 1));
		}
	}
	
	void write() {
		Message.SECRET_COMBINATION.writeln();
	}
	
	Result resolveCombination(ProposedCombination proposedCombination) {
		Result result = new Result();
		for (int i = 0; i < proposedCombination.colors.length; i++) {
			if (this.containsAtPosition(proposedCombination.colors[i], i)) {
				result.addBlack();
			} else if (this.containsAtAnyOtherPosition(proposedCombination.colors[i], i)) {
				result.addWhite();
			}
		}
		return result;
	}
	
	
	private boolean containsAtPosition(Color code, int position) {
		return this.colors[position] == code;
	}
	
	private boolean containsAtAnyOtherPosition(Color code, int position) {
		for (int i = 0; i < this.colors.length; i++) {
			if (i != position && this.colors[i] == code) {
				return true;
			}
		}
		return false;
	}
}
