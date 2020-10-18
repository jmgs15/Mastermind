package usantatecla.mastermind.models;

import usantatecla.mastermind.controllers.ProposalController;

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
		for (int i = 0; i < ProposalController.INITIALS.length; i++) {
			if (ProposalController.INITIALS[i] == character) {
				return Color.values()[i];
			}
		}
		return null;
	}
	
}
