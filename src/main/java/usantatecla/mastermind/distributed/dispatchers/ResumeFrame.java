package usantatecla.mastermind.distributed.dispatchers;

import usantatecla.mastermind.controllers.AcceptorController;
import usantatecla.mastermind.controllers.ResumeController;

public class ResumeFrame extends Frame {

	public ResumeFrame(AcceptorController acceptorController) {
		super(acceptorController);
	}

	@Override
	public void dispatch(String fullFrame) {
		String[] splittedFrame = this.splitFrame(fullFrame);
		((ResumeController) controller).resume(new Boolean(splittedFrame[1]));
	}

}
