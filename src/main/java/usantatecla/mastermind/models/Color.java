package usantatecla.mastermind.models;

public enum Color {
	RED, 
	BLUE, 
	YELLOW, 
	GREEN, 
	ORANGE, 
	PURPLE,
	NULL_COLOR;

	static int length() {
		return Color.values().length-1;
	}

	public static Color get(int index){
		return Color.values()[index];
	}

	public boolean isNull(){
		return this == Color.NULL_COLOR;
	}
	
}
