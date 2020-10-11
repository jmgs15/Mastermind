package mastermind;

import utils.Console;

enum Color {

	RED_CODE('r'),
	BLUE_CODE('b'),
	YELLOW_CODE('y'),
	GREEN_CODE('g'),
	ORANGE_CODE('o'),
	PURPLE_CODE('p'),
	NULL_CODE();

	private char code;

	private Color() {
	}
	
	private Color(char code) {
		this.code = code;
	}

	void write() {
		Console.instance().write(this.code);
	}
	
	static int length() {
		return Color.values().length;
	}
	
	static Color get(char code) {
		for (int i = 0; i < Color.length(); i++) {
			if (Color.get(i).code == code) {
				return Color.get(i);
			}
		}
		return NULL_CODE;
	}
	
	static Color get(int position) {
		return Color.values()[position];
	}
	
	@Override
	public String toString() {
		return "" + this.code;
	}

}