package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.BankCustomer;
import com.bank.repository.BankCustomerDao;

@Service
public class BankCustomerServiceImpl implements BankCustomerService{

	@Autowired
	private BankCustomerDao bcDao;

	@Override
	public void createCustomer(BankCustomer bc) {
		// TODO Auto-generated method stub
		bcDao.save(bc);
	}

	@Override
	public BankCustomer getBankCustomerDetail(int id) {
		// TODO Auto-generated method stub
		return bcDao.findById(id).orElse(null);
	}

	@Override
	public void deleteBankCustomerDetail(int id) {
		// TODO Auto-generated method stub
		bcDao.deleteById(id);
	}
	
}
