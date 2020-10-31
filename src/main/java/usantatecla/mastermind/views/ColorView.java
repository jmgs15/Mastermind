package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Color;
import usantatecla.utils.WithConsoleView;

public class ColorView extends WithConsoleView{
	
	public void write(Color color) {
		this.console.write(Color.getInitial(color));
	}

}
