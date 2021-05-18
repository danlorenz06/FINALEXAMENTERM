package com.bank;

public class Checkings extends Account{

	public Checkings(int accountnumber){
		super(accountnumber); 	//reference variable to refer a parent class constructors
	}
	
	public int getAccountNumber(){
		return accountnumber;
	}
	
	public double getAccountBalance(){
		return accountbalance;
	}
	
	public String getInformation() {
		return(" Checking Account Information" +"\n Account Number" + getAccountNumber()+"\n Balance" + getAccountBalance());
	}

}
