package usantatecla.mastermind.controllers;

import usantatecla.mastermind.distributed.dispatchers.TCPIP;
import usantatecla.mastermind.models.Session;

public abstract class AcceptorController extends Controller {

	protected TCPIP tcpip;
	
	AcceptorController(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}

	public abstract void accept(ControllerVisitor controllersVisitor);
}
