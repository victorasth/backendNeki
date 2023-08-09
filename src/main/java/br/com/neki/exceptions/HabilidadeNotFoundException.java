package br.com.neki.exceptions;

public class HabilidadeNotFoundException extends Exception {

	private static final long serialVersionUID = 459891679589900823L;

	public HabilidadeNotFoundException() {
		super();
	}

	public HabilidadeNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public HabilidadeNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public HabilidadeNotFoundException(String message) {
		super(message);
	}

	public HabilidadeNotFoundException(Throwable cause) {
		super(cause);
	}

}
