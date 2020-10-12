package usantatecla.mastermind.views;

import usantatecla.mastermind.models.Result;

public class ResultView {

	Result result;
	
	ResultView(Result result) {
		this.result = result;
	}
	
	void writeln() {
		Message.RESULT.writeln(this.result.getBlacks(), this.result.getWhites());
	}
}
