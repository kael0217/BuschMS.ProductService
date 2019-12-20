package com.java.exception;

public class NotEnoughInventoryException extends RuntimeException{
	private static final long serialVersionUID = -532142054733098669L;

	public NotEnoughInventoryException(String message) {
		super(message);
	}
}
