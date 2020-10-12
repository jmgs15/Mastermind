package usantatecla.mastermind.models;

import java.util.ArrayList;
import java.util.List;

abstract class Combination {

	protected List<Color> colors;
	
	protected Combination (){
		this.colors = new ArrayList<Color>();
	}
	
	protected Combination(List<Color> colors) {
		this.colors = new ArrayList<>(colors);
	}
	
	public List<Color> getColors() {
		return this.colors;
	}
}
