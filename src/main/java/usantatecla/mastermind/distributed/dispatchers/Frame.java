package usantatecla.mastermind.distributed.dispatchers;

import usantatecla.mastermind.controllers.AcceptorController;

public abstract class Frame {

	AcceptorController controller;
	
	public Frame(AcceptorController controller) {
		this.controller = controller;
	}
	
	protected String[] splitFrame(String fullFrame) {
		return FrameType.splitFrame(fullFrame);
	}
	
	public abstract void dispatch(String fullFrame);
}
