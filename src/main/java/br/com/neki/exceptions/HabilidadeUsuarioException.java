package br.com.neki.exceptions;

public class HabilidadeUsuarioException extends Exception {

	private static final long serialVersionUID = 6654096168063333836L;

	public HabilidadeUsuarioException() {
		super();
	}

	public HabilidadeUsuarioException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public HabilidadeUsuarioException(String message, Throwable cause) {
		super(message, cause);
	}

	public HabilidadeUsuarioException(String message) {
		super(message);
	}

	public HabilidadeUsuarioException(Throwable cause) {
		super(cause);
	}

}
