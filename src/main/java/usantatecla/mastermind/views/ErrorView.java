package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Error;
import usantatecla.utils.Console;

public class ErrorView {

	private static final String[] MESSAGES = {
			"Repeated colors",
			"Wrong colors, they must be: " + new ColorView().getInitials(),
			"Wrong proposed combination length"
	};
	
	private Error error;
	
	ErrorView(Error error) {
		this.error = error;
	}
	
	void writeln() {
		if (!this.error.isNull()){
			Console.instance().writeln(MESSAGES[this.error.ordinal()]);		
		}
	}
}
