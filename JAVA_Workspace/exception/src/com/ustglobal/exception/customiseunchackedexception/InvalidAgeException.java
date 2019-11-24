package com.ustglobal.exception.customiseunchackedexception;

public class InvalidAgeException extends RuntimeException {

	String message = "Invalid Age";

	public InvalidAgeException() {

	}

	public InvalidAgeException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}


}
