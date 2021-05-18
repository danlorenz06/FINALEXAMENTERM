package com.bank;

public abstract class Account {
	int accountnumber;						//include a constructor
	double accountbalance;
	
	public Account(int balnumber){
	accountbalance = balnumber;				
	setBalance(0.0);
	}
	
	public void setBalance(double x) {
		accountbalance = x;
	}
	
	public abstract int getAccountNumber();
	public abstract double getAccountBalance();
	public abstract String getInformation();
}
