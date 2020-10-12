package usantatecla.mastermind.views;

import java.util.ArrayList;
import java.util.List;

import usantatecla.mastermind.models.Color;
import usantatecla.mastermind.models.Result;
import usantatecla.utils.Console;

public class ColorView {

	private static final char[] INITIALS = {'r', 'b', 'y', 'g', 'o', 'p', ' '};
	Color color;
	
	ColorView() {}
	
	ColorView(Color color) {
		this.color = color;
	}

	public List<Color> getColors(String initialsColors) {
		assert initialsColors.length() == Result.WIDTH;
		List<Color> colors = new ArrayList<>();
		for (int i = 0; i < initialsColors.length(); i++) {
			colors.add(this.getInstance(initialsColors.charAt(i)));
		}
		return colors;
	}

	Color getInstance(char character) {
		for(int i=0; i<INITIALS.length; i++) {
			if (INITIALS[i] == character) {
				return Color.get(i);
			}
		}
		return Color.NULL_COLOR;
	}
	
	String getInitials() {
		String result = "";
		for(int i=0; i<INITIALS.length; i++) {
			result += INITIALS[i];
		}
		return result;
	}
	
	void write() {
		assert this.color != Color.NULL_COLOR;
		new Console().write(ColorView.INITIALS[color.ordinal()]);
	}
}
