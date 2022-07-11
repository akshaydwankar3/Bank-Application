package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.BankAccount;
import com.bank.repository.BankAccountDao;

@Service
public class BankAccountServiceImpl implements BankAccountService{

	@Autowired
	private BankAccountDao abDao;
	
	@Override
	public void createAccount(BankAccount ab) {
		// TODO Auto-generated method stub
		abDao.save(ab);
	}

	@Override
	public double getBankAccountBalance(int id) {
		// TODO Auto-generated method stub
		return abDao.findAccountBalanceByAccountId(id);
	}

	@Override
	public void creditBalance(int id, double amount) {
		// TODO Auto-generated method stub
		abDao.addBalanceByAccountId(id, amount);
	}

	@Override
	public void debitBalance(int id, double amount) {
		// TODO Auto-generated method stub
		abDao.getAccountBalanceById(id, amount);
	}

	@Override
	public BankAccount getAllDetails(int id) {
		// TODO Auto-generated method stub
		return abDao.findById(id).orElse(null);
	}

}
