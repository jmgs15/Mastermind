package usantatecla.mastermind.models;

import java.util.List;

public class SessionImplementation implements Session {

    private GameReal game;
    private GameRegistry gameRegistry;
    private State state;
    
    public SessionImplementation() {
    	this.state = new State();
    	this.game = new GameReal();
    	this.gameRegistry = new GameRegistry(this.game);
    }
    
    public StateValue getValueState() {
		return this.state.getValueState();
    }
    
	public int getBlacks(int position) {
		return this.game.getBlacks(position);
	}
	
	public int getWhites(int position) {
		return this.game.getWhites(position);
	}
	
	public List<Color> getColors(int position) {
		return this.game.getColors(position);
	}
	
	public boolean isLooser() {
		return this.game.isLooser();
	}
	
	public boolean isWinner() {
		return this.game.isWinner();
	}
	
	public void addProposedCombination(ProposedCombination proposedCombination) {
		this.game.addProposedCombination(proposedCombination);
	}
	
	public void addMemento() {
		this.gameRegistry.addMemento(this.game);
	}
	
	public int getAttempts() {
		return this.game.getAttempts();
	}
	
	public Error isProposedCombinationValid(String characters) {
		return this.game.isProposedCombinationValid(characters);
	}
	
	public ProposedCombination getProposedCombination(String characters) {
		return this.game.getProposedCombination(characters);
	}

	public int getSecretCombinationWidth() {
		return this.game.getSecretCombinationWidth();
	}
	
	public void nextState() {
		this.state.next();
	}
	
	public void newGame() {
		this.game.clear();
		this.state.reset();
		this.gameRegistry.reset();
	}
	
	public boolean undoable() {
		return this.gameRegistry.undoable();
	}
	
	public void undo() {
		this.gameRegistry.undo();
	}
	
	public boolean redoable() {
		return this.gameRegistry.redoable();
	}
	
	public void redo() {
		this.gameRegistry.redo();
	}
}
