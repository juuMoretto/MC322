package br.unicamp.ic.mc322.lab04.robot;

public class OutOfBoundaryError extends Exception {

	public OutOfBoundaryError(String errorMessage) {
        super(errorMessage);
    }
	public OutOfBoundaryError() {
        
    }
	public OutOfBoundaryError(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
	public OutOfBoundaryError(Throwable err) {
        super(err);
    }
	

}
