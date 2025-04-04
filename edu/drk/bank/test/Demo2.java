package edu.drk.bank.test;

import edu.drk.bank.RBIBank;
import edu.drk.bank.exception.InsufficientException;
import edu.drk.bank.exception.OverLimitException;
import edu.drk.bank.impl.AxisBank;
import edu.drk.bank.impl.SBIBank;

public class Demo2 {

	public static void main(String[] args) {
		
		RBIBank bank = null;
		RBIBank sbiBank = null;
		RBIBank axisBank = null;
		
		sbiBank = new SBIBank(10345,"Ramu",5000);
		axisBank = new AxisBank(23890,"Ramu",7500);
		
		try {
			sbiBank.deposit(75000);
		} catch (OverLimitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sbiBank.checkBalance();
		
		try {
			axisBank.deposit(75000);
		} catch (OverLimitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		axisBank.checkBalance();
	}

}
