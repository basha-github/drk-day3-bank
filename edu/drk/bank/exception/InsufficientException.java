package edu.drk.bank.exception;



public class InsufficientException extends Exception{
	
	String error;

	public InsufficientException(String error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "InsufficientException [error=" + error + "]";
	}
	
	

}
