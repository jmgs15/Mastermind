package usantatecla.mastermind.distributed;

import java.util.List;

import usantatecla.mastermind.controllers.PlayController;
import usantatecla.mastermind.distributed.dispatchers.FrameType;
import usantatecla.mastermind.distributed.dispatchers.TCPIP;
import usantatecla.mastermind.models.Color;
import usantatecla.mastermind.models.Error;
import usantatecla.mastermind.models.ProposedCombination;
import usantatecla.mastermind.models.Session;

public class PlayControllerProxy extends PlayController {

	private TCPIP tcpip;

	PlayControllerProxy(Session session, TCPIP tcpip) {
		super(session);
		this.tcpip = tcpip;
	}

	@Override
	public int getBlacks(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getWhites(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Color> getColors(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isLooser() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWinner() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addProposedCombination(String charCombination) {
		this.tcpip.send(FrameType.ADD_COMBINATION.name().concat("#").concat(charCombination));		
	}

	@Override
	public int getAttempts() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Error isProposedCombinationValid(String characters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProposedCombination getProposedCombination(String characters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getSecretCombinationWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isGameFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean undoable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void undo() {
		this.tcpip.send(FrameType.UNDO.name());		
	}

	@Override
	public boolean redoable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void redo() {
		this.tcpip.send(FrameType.REDO.name());		
	}

}
