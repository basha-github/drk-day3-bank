package edu.drk.bank.exception;

public class OverLimitException extends Exception {
	
	String code;

	public OverLimitException(String code) {
		super();
		this.code = code;
	}

	@Override
	public String toString() {
		return "OverLimitException [code=" + code + "]";
	}
	
	

}
