package usantatecla.mastermind.views.console;

import usantatecla.mastermind.models.Game;

public class View extends usantatecla.mastermind.views.View {
	
	private StartView startView;
	private ProposalView proposalView;
	private ResumeView resumeView;
	
	public View(Game game) {
		super(game);
		this.game = game;
		this.startView = new StartView();
		this.proposalView = new ProposalView(this.game);
		this.resumeView = new ResumeView(this.game);
	}

	@Override
	protected void start() {
		this.startView.interact();
	}

	@Override
	protected boolean play() {
		return this.proposalView.interact();
	}

	@Override
	protected boolean isNewGame() {
		return this.resumeView.interact();
	}

}
