package usantatecla.mastermind.controllers;

import usantatecla.mastermind.distributed.dispatchers.FrameType;
import usantatecla.mastermind.distributed.dispatchers.TCPIP;
import usantatecla.mastermind.models.Session;

public class StartController extends AcceptorController {

    public StartController(Session session, TCPIP tcpip) {
		super(session, tcpip);
	}

	@Override
	public void accept(ControllerVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}
	
	public void nextState() {
		if (this.tcpip == null) {
			this.session.nextState();
		} else {
			this.tcpip.send(FrameType.START.name());
		}
	}
}
