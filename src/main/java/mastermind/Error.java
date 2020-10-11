package mastermind;

import utils.Console;

enum Error {

	WRONG_COLOURS("Wrong colours, they must be: rbygop"),
	WRONG_LENGTH("Wrong proposed combination length"),
	NULL_ERROR;

	private String message;

	Error() {
	}

	Error(String message){
		this.message = message;
	}

	void writeln() {
		if (this != Error.NULL_ERROR){
			Console.instance().writeln(this.message);
		}
	}

}
