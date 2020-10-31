package usantatecla.mastermind.distributed.dispatchers;

import usantatecla.mastermind.controllers.AcceptorController;
import usantatecla.mastermind.controllers.StartController;
import usantatecla.mastermind.views.MessageView;

public class StartFrame extends Frame {

	public StartFrame(AcceptorController acceptorController) {
		super(acceptorController);
	}

	@Override
	public void dispatch(String fullFrame) {
		MessageView.TITLE.writeln();
		((StartController) this.controller).nextState();
	}
	
}
