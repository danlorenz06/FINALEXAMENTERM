package com.bank;

import javax.swing.JOptionPane;

public class AccountUnitTest {
	public static void main(String[]args) {
		Checkings accountcheck = new Checkings(1);
		Savings accountsave = new Savings(2, 1.6);
		
		JOptionPane.showMessageDialog(null, accountcheck.getInformation());
		JOptionPane.showMessageDialog(null, accountsave.getInformation());
		}

}
