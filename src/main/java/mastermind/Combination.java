package mastermind;

public class Combination {
	
	static final int POSITIONS = 4;
	
	protected Color[] colors;
	
	Combination() {
		colors = new Color[POSITIONS];
	}
	
	void putCodePegs(String initialsColors) {
		for (int i = 0; i < initialsColors.length(); i++) {
			this.colors[i] = Color.get(initialsColors.charAt(i));
		}
	}
}
