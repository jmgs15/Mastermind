package usantatecla.mastermind.distributed;

import usantatecla.mastermind.distributed.dispatchers.Dispatcher;

public class MastermindServer {

	private Dispatcher dispatcher;

	private LogicServer logic;

	private MastermindServer() {
		this.dispatcher = new Dispatcher();
		this.logic = new LogicServer(this.dispatcher, true);
	}

	private void serve() {
		this.dispatcher.serve();
	}

	public static void main(String[] args) {
		new MastermindServer().serve();
	}
}
