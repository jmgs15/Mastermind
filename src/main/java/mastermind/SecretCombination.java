package mastermind;

import java.util.Random;

public class SecretCombination extends Combination {
	
	SecretCombination() {
		Random random = new Random(System.currentTimeMillis());
		
		for (int i = 0; i < this.codePegs.length; i++) {
			this.codePegs[i] = CodePeg.get(random.nextInt(CodePeg.values().length - 1));
		}
	}
	
	void write() {
		Message.SECRET_COMBINATION.writeln();
	}
	
	Result resolveCombination(ProposedCombination proposedCombination) {
		Result result = new Result();
		for (int i = 0; i < proposedCombination.codePegs.length; i++) {
			if (this.containsAtPosition(proposedCombination.codePegs[i], i)) {
				result.addBlack();
			} else if (this.containsAtAnyOtherPosition(proposedCombination.codePegs[i], i)) {
				result.addWhite();
			}
		}
		return result;
	}
	
	
	private boolean containsAtPosition(CodePeg code, int position) {
		return this.codePegs[position] == code;
	}
	
	private boolean containsAtAnyOtherPosition(CodePeg code, int position) {
		for (int i = 0; i < this.codePegs.length; i++) {
			if (i != position && this.codePegs[i] == code) {
				return true;
			}
		}
		return false;
	}
}
