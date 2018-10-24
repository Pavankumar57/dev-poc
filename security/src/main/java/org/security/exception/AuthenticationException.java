package org.security.exception;

public class AuthenticationException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3177650753502495017L;

	public AuthenticationException(String message, Throwable cause) {
		super(message, cause);
	}
}
