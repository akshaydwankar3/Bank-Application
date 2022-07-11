package com.bank.service;

import com.bank.model.BankPerson;

public interface BankPersonService {

	public void savePerson(BankPerson bp);
	
	public BankPerson personDetails(int id);
	
	public void removeBankPerson(int id);
	
}
