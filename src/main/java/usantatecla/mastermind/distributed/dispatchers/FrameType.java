package usantatecla.mastermind.distributed.dispatchers;

public enum FrameType { 
	START,
	ADD_COMBINATION,
	RESUME_OPTION,
	CLOSE;

	public static FrameType parser(String string) {
		for(FrameType frameType : FrameType.values()) {
			if (frameType.name().equals(string)) {
				return frameType;
			}
		}
		return null;
	}
	
	public static FrameType decode(String fullFrame) {
		String[] splittedFullFrame = splitFrame(fullFrame);
		return parser(splittedFullFrame[0]);
	}

	public static String[] splitFrame(String fullFrame) {
		String[] splittedFullFrame = fullFrame.split("#");
		return splittedFullFrame;
	}
}
