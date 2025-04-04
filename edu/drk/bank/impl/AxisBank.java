package edu.drk.bank.impl;

import edu.drk.bank.RBIBank;
import edu.drk.bank.exception.InsufficientException;
import edu.drk.bank.exception.OverLimitException;

public class AxisBank implements RBIBank{
	
	long accNo;
	String name;
	long balance;
	
	
	

	public AxisBank(long accNo, String name, long balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		System.out.println("From Axis Bank Successfully "+name+" Account got "+
		" Created with initail balance "+balance);
	}

	@Override
	public void deposit(long amt) throws OverLimitException {
		
		if(amt > 200000) {
			throw new OverLimitException(amt+"");
		}
		else {
			this.balance = this.balance + amt;
			System.out.println(" From Axis Bank Successfully Deposited amt-->"+amt);
			
		}		
	}

	@Override
	public void withDraw(long amt) throws InsufficientException,OverLimitException {
		
		if(this.balance > amt) {// 8500 > 2000
			if(amt<200000) {
				this.balance = this.balance - amt;
				System.out.println("From Axis Bank Successfully withdrawn amt-->"+amt);	
				
			}
			else {
				throw new OverLimitException(amt+"");
			}
		}
		else {
			throw new InsufficientException(amt+"");
		}
		
	}

	@Override
	public void checkBalance() {
		
		System.out.println("From Axis Bank "+name+" Account avl balance---->"+this.balance);
		
	}

}
