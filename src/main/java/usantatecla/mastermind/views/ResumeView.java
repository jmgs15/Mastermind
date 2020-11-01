package usantatecla.mastermind.views.console;

import usantatecla.mastermind.views.MessageView;
import usantatecla.utils.YesNoDialog;

public class ResumeView {

	public boolean read() {
		MessageView.RESUME.write();
		return new YesNoDialog().read();
	}

}
