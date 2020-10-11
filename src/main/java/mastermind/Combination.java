package mastermind;

public class Combination {
	
	static final int POSITIONS = 4;
	
	protected CodePeg[] codePegs;
	
	Combination() {
		codePegs = new CodePeg[POSITIONS];
	}
	
	void putCodePegs(String initialsCodePegs) {
		for (int i = 0; i < initialsCodePegs.length(); i++) {
			this.codePegs[i] = CodePeg.get(initialsCodePegs.charAt(i));
		}
	}
}
