package br.com.neki.exceptions;

public class HabilidadeUsuarioNotFoundException extends Exception {

	private static final long serialVersionUID = 1878170711463441417L;

	public HabilidadeUsuarioNotFoundException() {
		super();
		
	}

	public HabilidadeUsuarioNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	public HabilidadeUsuarioNotFoundException(String message, Throwable cause) {
		super(message, cause);

	}

	public HabilidadeUsuarioNotFoundException(String message) {
		super(message);
		
	}

	public HabilidadeUsuarioNotFoundException(Throwable cause) {
		super(cause);
		
	}

}
