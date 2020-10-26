package usantatecla.mastermind.views.console;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.models.Color;
import usantatecla.utils.WithConsoleView;

public class ColorView extends WithConsoleView{
	
	public void write(Color color) {
		this.console.write(PlayController.INITIALS[color.ordinal()]);
	}

}
