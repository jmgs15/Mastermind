package usantatecla.mastermind.distributed;

import usantatecla.mastermind.controllers.implementation.LogicImplementation;
import usantatecla.mastermind.distributed.dispatchers.Dispatcher;
import usantatecla.mastermind.distributed.dispatchers.FrameType;
import usantatecla.mastermind.distributed.dispatchers.StartFrame;

public class LogicImplementationServer extends LogicImplementation {

	public void createDispatchers(Dispatcher dispatcher) {
		dispatcher.add(FrameType.START, new StartFrame(this.startControllerImplementation));
		dispatcher.add(FrameType.ADD_COMBINATION, new StartFrame(this.playControllerImplementation));
		dispatcher.add(FrameType.RESUME_OPTION, new StartFrame(this.resumeControllerImplementation));
	}

}
