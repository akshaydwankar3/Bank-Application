package com.bank.service;

import com.bank.model.BankCustomer;

public interface BankCustomerService {

	public void createCustomer(BankCustomer bc);
	
	public BankCustomer getBankCustomerDetail(int id);
	
	public void deleteBankCustomerDetail(int id);
	
}
