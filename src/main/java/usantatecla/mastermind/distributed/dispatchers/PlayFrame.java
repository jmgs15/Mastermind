package usantatecla.mastermind.distributed.dispatchers;

import usantatecla.mastermind.controllers.AcceptorController;
import usantatecla.mastermind.controllers.PlayController;

public class PlayFrame extends Frame {

	public PlayFrame(AcceptorController acceptorController) {
		super(acceptorController);
	}

	@Override
	public void dispatch(String fullFrame) {
		String[] splittedFrame = this.splitFrame(fullFrame);
		((PlayController) this.controller).getProposedCombination(splittedFrame[1]);
	}

}
