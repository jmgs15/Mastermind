package usantatecla.mastermind.models;

import usantatecla.mastermind.controllers.PlayController;

public enum Color {
	RED, 
	BLUE, 
	YELLOW, 
	GREEN, 
	ORANGE, 
	PURPLE;

	static int length() {
		return Color.values().length;
	}
	
	public static Color getInstance(char character) {
		for (int i = 0; i < PlayController.INITIALS.length; i++) {
			if (PlayController.INITIALS[i] == character) {
				return Color.values()[i];
			}
		}
		return null;
	}
	
}
