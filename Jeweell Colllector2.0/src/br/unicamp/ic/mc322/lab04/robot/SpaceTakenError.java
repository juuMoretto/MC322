package br.unicamp.ic.mc322.lab04.robot;

public class SpaceTakenError extends Exception {

	public SpaceTakenError(String errorMessage) {
        super(errorMessage);
    }
	public SpaceTakenError() {
        
    }
	public SpaceTakenError(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
	public SpaceTakenError(Throwable err) {
        super(err);
    }
	

}
