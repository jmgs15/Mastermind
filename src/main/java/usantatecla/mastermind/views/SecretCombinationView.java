package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Color;
import usantatecla.mastermind.models.SecretCombination;
import usantatecla.utils.Console;

class SecretCombinationView {

	private SecretCombination secretCombination;
	
	SecretCombinationView(SecretCombination secretCombination) {
		this.secretCombination = secretCombination;
	}
	
	void writeln() {
		Console.instance().write("**** - ");
		for (Color color : this.secretCombination.getColors()) {
			new ColorView(color).write();
		}
		Console.instance().writeln();
	}
}
