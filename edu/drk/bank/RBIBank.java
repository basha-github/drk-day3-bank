
package edu.drk.bank;

import edu.drk.bank.exception.InsufficientException;
import edu.drk.bank.exception.OverLimitException;

public interface RBIBank {
	
	void deposit(long amt) throws OverLimitException;
	void withDraw(long amt) throws InsufficientException,OverLimitException;
	void checkBalance();

}
