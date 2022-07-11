package com.bank.service;

import com.bank.model.BankAccount;

public interface BankAccountService {

	public void createAccount(BankAccount ab);
	
	public double getBankAccountBalance(int id);
	
	public void creditBalance(int id, double amount);
	
	public void debitBalance(int id, double amount);
	
	public BankAccount getAllDetails(int id);
}
