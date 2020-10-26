package usantatecla.mastermind.controllers;

public interface ControllerVisitor {

	void visit(StartController startController);
	
	void visit(PlayController proposalController);
	
	void visit(ResumeController resumeController);
    
}