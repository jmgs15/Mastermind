package usantatecla.mastermind.distributed;

import usantatecla.mastermind.distributed.dispatchers.Dispatcher;

public class MastermindServer {

	private Dispatcher dispatcher;

	private LogicImplementationServer logic;

	private MastermindServer() {
		this.dispatcher = new Dispatcher();
		this.logic = new LogicImplementationServer();
		this.logic.createDispatchers(this.dispatcher);
	}

	private void serve() {
		this.dispatcher.serve();
	}

	public static void main(String[] args) {
		new MastermindServer().serve();
	}
}
