package br.unicamp.ic.mc322.lab04.RPG.exceptions;

public class LocalOcupadoException extends IllegalStateException {
	public LocalOcupadoException() {
		super();
	}
	
	public LocalOcupadoException(String message) {
		super(message);
	}
	
	public LocalOcupadoException(Throwable cause) {
		super(cause);
	}
	
	public LocalOcupadoException(String message, Throwable cause) {
		super(message, cause);
	}

}
