package usantatecla.mastermind.distributed;

import usantatecla.mastermind.controllers.Logic;
import usantatecla.mastermind.distributed.dispatchers.Dispatcher;
import usantatecla.mastermind.distributed.dispatchers.FrameType;
import usantatecla.mastermind.distributed.dispatchers.StartFrame;
import usantatecla.mastermind.models.StateValue;

public class LogicServer extends Logic {
	
	public LogicServer(Dispatcher dispatcher, Boolean isStandalone) {
		super(isStandalone);
		createDispatchers(dispatcher);
	}

	public void createDispatchers(Dispatcher dispatcher) {
		dispatcher.add(FrameType.START, new StartFrame(this.getController(StateValue.INITIAL)));
		dispatcher.add(FrameType.ADD_COMBINATION, new StartFrame(this.getController(StateValue.IN_GAME)));
		dispatcher.add(FrameType.RESUME_OPTION, new StartFrame(this.getController(StateValue.RESUME)));
	}
}
