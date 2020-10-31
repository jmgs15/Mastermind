package usantatecla.mastermind.controllers;

import java.util.HashMap;
import java.util.Map;

import usantatecla.mastermind.distributed.dispatchers.TCPIP;
import usantatecla.mastermind.models.Session;
import usantatecla.mastermind.models.StateValue;

public class Logic {

	private Session session;
	private Map<StateValue, AcceptorController> controllers;
	private TCPIP tcpip;

	public Logic(boolean isStandalone) {
		if (isStandalone) {
			this.tcpip = null;
		} else {
			this.tcpip = TCPIP.createClientSocket();
		}
		this.session = new Session();
		
		this.controllers = new HashMap<StateValue, AcceptorController>();		
		this.controllers.put(StateValue.INITIAL, new StartController(this.session, this.tcpip));
		this.controllers.put(StateValue.IN_GAME, new PlayController(this.session, this.tcpip));
		this.controllers.put(StateValue.RESUME, new ResumeController(this.session, this.tcpip));
		this.controllers.put(StateValue.EXIT, null);
	}

	public AcceptorController getController() {
		return this.controllers.get(this.session.getValueState());
	}
	
	public AcceptorController getController(StateValue state) {
		return this.controllers.get(state);
	}
	
	public void close() {
		this.tcpip.close();
	}
}