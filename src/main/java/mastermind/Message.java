package mastermind;

import java.text.MessageFormat;

import utils.Console;

enum Message {
	TITTLE("----- MASTERMIND -----"),
	ATTEMPTS("{0} attempt(s):"),
	SECRET_COMBINATION("xxxx"),
	PROPOSE_COMBINATION("Propose a combination:"),
	RESULT(" --> {0} blacks and {1} whites"),
	PLAYER_WIN("You've won!!! ;-)"),
	PLAYER_LOOSE("You've lost!!! :-("),
	RESUME("RESUME? (y/n):"),
	NULL_MESSAGE();

	private String message;

	private Message() {
		
	}
	
	private Message(String message) {
		this.message = message;
	}

	void write() {
		Console.instance().write(this.message);
	}

	void writeln() {
		Console.instance().writeln(this.message);
	}
	
	void writeln(Object... objects) {
		Console.instance().writeln(MessageFormat.format(this.message, objects));
	}

	@Override
	public String toString() {
		return this.message;
	}

}