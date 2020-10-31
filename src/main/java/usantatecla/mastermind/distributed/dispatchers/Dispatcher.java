package usantatecla.mastermind.distributed.dispatchers;

import java.util.HashMap;
import java.util.Map;

public class Dispatcher {
	
	protected TCPIP tcpip;
	
	private Map<FrameType, Frame> dispatcherMap;
	
	public Dispatcher () {
		this.tcpip = TCPIP.createServerSocket();
		this.dispatcherMap = new HashMap<FrameType, Frame>();
	}

	public void add (FrameType frameType, Frame frame) {
		this.dispatcherMap.put(frameType, frame);
	}
	
	public void associate(TCPIP tcpip) {
		this.tcpip = tcpip;
	}

	public void serve() {
		FrameType frameType = null;
		do {
			String fullFrame = this.tcpip.receiveLine();
			frameType = FrameType.decode(fullFrame);
			if (frameType != FrameType.CLOSE) {
				dispatcherMap.get(frameType).dispatch(fullFrame);
			}
		} while (frameType != FrameType.CLOSE);
		this.tcpip.close();		
	}

}
