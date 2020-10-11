package mastermind;

public class Result {

	private int blacks;
	private int whites;
	
	Result() {
		blacks = 0;
		whites = 0;
	}
	
	boolean isCombinationCorrect() {
		return blacks == Combination.POSITIONS;
	}
	
	void addBlack() {
		this.blacks++;
	}
	
	void addWhite() {
		this.whites++;
	}
	
	void write() {
		Message.RESULT.writeln(blacks, whites);
	}
}
