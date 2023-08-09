package br.com.neki.exceptions;

public class HabilidadeException extends Exception {

	private static final long serialVersionUID = -4421323640032251517L;

	public HabilidadeException() {
		super();
	}

	public HabilidadeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public HabilidadeException(String message, Throwable cause) {
		super(message, cause);
	}

	public HabilidadeException(String message) {
		super(message);
	}

	public HabilidadeException(Throwable cause) {
		super(cause);
	}

}
