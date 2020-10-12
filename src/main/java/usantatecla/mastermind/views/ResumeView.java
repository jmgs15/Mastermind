package usantatecla.mastermind.views;

import usantatecla.utils.YesNoDialog;

public class ResumeView {

  boolean interact() {
	  return new YesNoDialog().read(Message.RESUME.toString());
	}
}
