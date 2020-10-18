package usantatecla.mastermind.controllers;

public interface ControllersVisitor {

	void visit(ProposalController proposalController);
	
	void visit(ResumeController resumeController);
    
}