package usantatecla.mastermind.models;

import java.util.ArrayList;
import java.util.List;

public class GameRegistry {
	
	  private List<GameMemento> mementoList;
	  private GameReal game;

	  private int firstPrevious;

	  GameRegistry(GameReal game) {
	    this.game = game;
	    this.reset();
	  }

	  void reset() {
	    this.mementoList = new ArrayList<GameMemento>();
	    this.firstPrevious = 0;
	  }

	  void registry() {
	    mementoList.clear();
	    this.firstPrevious = 0;
	    this.mementoList.add(this.firstPrevious, this.game.createMemento());
	  }
	  
	  void addMemento(GameReal game) {
		  this.mementoList.add(game.createMemento());
	  }

	  void undo() {
	    this.firstPrevious++;
	    this.game.set(this.mementoList.get(this.firstPrevious));
	  }

	  void redo() {
	    this.firstPrevious--;
	    this.game.set(this.mementoList.get(this.firstPrevious));
	  }

	  boolean undoable() {
	    return this.firstPrevious < this.mementoList.size() - 1;
	  }

	  boolean redoable() {
	    return this.firstPrevious >= 1;
	  }
}
