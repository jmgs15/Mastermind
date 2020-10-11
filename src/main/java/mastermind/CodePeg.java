package mastermind;

import utils.Console;

enum CodePeg {

	RED_CODE('r'),
	BLUE_CODE('b'),
	YELLOW_CODE('y'),
	GREEN_CODE('g'),
	ORANGE_CODE('o'),
	PURPLE_CODE('p'),
	NULL_CODE();

	private char code;

	private CodePeg() {
	}
	
	private CodePeg(char code) {
		this.code = code;
	}

	void write() {
		Console.instance().write(this.code);
	}
	
	static int length() {
		return CodePeg.values().length;
	}
	
	static CodePeg get(char code) {
		for (int i = 0; i < CodePeg.length(); i++) {
			if (CodePeg.get(i).code == code) {
				return CodePeg.get(i);
			}
		}
		return NULL_CODE;
	}
	
	static CodePeg get(int position) {
		return CodePeg.values()[position];
	}
	
	@Override
	public String toString() {
		return "" + this.code;
	}

}