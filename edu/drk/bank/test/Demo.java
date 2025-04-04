package edu.drk.bank.test;

import edu.drk.bank.exception.InsufficientException;
import edu.drk.bank.exception.OverLimitException;
import edu.drk.bank.impl.AxisBank;
import edu.drk.bank.impl.SBIBank;

public class Demo {

	public static void main(String[] args) {
		
		SBIBank ramuSBIAcc = new SBIBank(10345,"Ramu",5000);
		AxisBank ramuAxisAcc = new AxisBank(23890,"Ramu",7500);
		
		try {
			ramuSBIAcc.deposit(75000);
		} catch (OverLimitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ramuSBIAcc.checkBalance();
		
		try {
			ramuAxisAcc.deposit(75000);
		} catch (OverLimitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ramuAxisAcc.checkBalance();
	}

}
