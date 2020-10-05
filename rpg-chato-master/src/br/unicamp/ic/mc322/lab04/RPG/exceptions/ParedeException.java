package br.unicamp.ic.mc322.lab04.RPG.exceptions;
import br.unicamp.ic.mc322.lab04.RPG.*;

public class ParedeException extends IllegalArgumentException {
	private Componentes compenente;
	public ParedeException(Componentes compenente) {
		super();
	}
	
	public ParedeException(Componentes compenente, String message) {
		super(message);
	}
	
	public ParedeException(Componentes compenente, Throwable cause) {
		super(cause);
	}
	
	public ParedeException(Componentes compenente, String message, Throwable cause) {
		super(message, cause);
	}

	
}