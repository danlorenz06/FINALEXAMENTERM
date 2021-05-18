package com.bank;

public class Savings extends Account {

	private double rate;
	
	public Savings(int accountNumber, double interest){
		super(accountNumber);
		setInterest(interest);
	}
	
	public void setInterest(double interest){
		rate=interest;
	}
	
	public double setInterest() {
		return rate;
	}
	
	public int getAccountNumber(){
		return accountnumber;
	}
	
	public double getAccountBalance(){
		return accountbalance;
	}
	
	public String getInformation() {
		return("Savings Account Information"+"\n Account Number" + getAccountNumber() +"\n Balance" + getAccountBalance() +"\n Interest"+setInterest() );
	
	}

	
}
