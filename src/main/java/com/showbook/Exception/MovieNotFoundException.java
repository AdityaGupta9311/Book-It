package com.showbook.Exception;

public class MovieNotFoundException extends RuntimeException {

	public MovieNotFoundException(String message) {
		super(message);
	}
}
