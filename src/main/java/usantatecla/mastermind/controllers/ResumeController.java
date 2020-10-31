package usantatecla.mastermind.controllers;

import usantatecla.mastermind.distributed.dispatchers.FrameType;
import usantatecla.mastermind.distributed.dispatchers.TCPIP;
import usantatecla.mastermind.models.Session;

public class ResumeController extends AcceptorController {

    public ResumeController(Session session, TCPIP tcpip) {
		super(session, tcpip);
	}
	
	public void resume(boolean isResumed) {
		if (this.tcpip == null) {
			if (isResumed) {
				this.session.newGame();
			} else {
				this.session.nextState();
			}
		} else {
			this.tcpip.send(FrameType.RESUME_OPTION.name().concat("#").concat("" + isResumed));
		}
		
	}

	@Override
	public void accept(ControllerVisitor controllersVisitor) {
		controllersVisitor.visit(this);
	}
}
