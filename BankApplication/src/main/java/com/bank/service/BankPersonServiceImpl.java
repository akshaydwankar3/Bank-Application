package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.BankPerson;
import com.bank.repository.BankPersonDao;

@Service
public class BankPersonServiceImpl implements BankPersonService{

	@Autowired
	private BankPersonDao bpDao;
	
	@Override
	public void savePerson(BankPerson bp) {
		// TODO Auto-generated method stub
		bpDao.save(bp);
	}

	@Override
	public BankPerson personDetails(int id) {
		// TODO Auto-generated method stub
		return bpDao.findById(id).orElse(null);
	}

	@Override
	public void removeBankPerson(int id) {
		// TODO Auto-generated method stub
		bpDao.deleteById(id);
	}

}
