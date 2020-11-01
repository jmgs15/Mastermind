package usantatecla.mastermind.distributed;

import usantatecla.mastermind.controllers.ResumeController;
import usantatecla.mastermind.distributed.dispatchers.FrameType;
import usantatecla.mastermind.distributed.dispatchers.TCPIP;
import usantatecla.mastermind.models.Session;

public class ResumeControllerProxy extends ResumeController {
	
	private TCPIP tcpip;

	public ResumeControllerProxy(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}

	@Override
	public void resume(boolean isResumed) {
		this.tcpip.send(FrameType.RESUME_OPTION.name().concat("#").concat("" + isResumed));		
	}
}
