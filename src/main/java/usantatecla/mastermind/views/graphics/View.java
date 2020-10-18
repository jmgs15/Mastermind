package usantatecla.mastermind.views.graphics;

import usantatecla.mastermind.controllers.Controller;
import usantatecla.mastermind.controllers.ProposalController;
import usantatecla.mastermind.controllers.ResumeController;

public class View extends usantatecla.mastermind.views.View {

	PlayView playView;
	
	public View () {
		this.playView = new PlayView();
	}

	@Override
	public void interact(Controller controller) {
		if (controller instanceof ProposalController) {
			this.playView.interact((ProposalController) controller);
		} else {
			this.playView.interact((ResumeController) controller);
		}
	}
	


}
