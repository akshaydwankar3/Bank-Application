package com.bank.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bank.model.BankAccount;

@Repository
public interface BankAccountDao extends JpaRepository<BankAccount, Integer>{

	@Query("select balance from BankAccount where id=?1")
	public int findAccountBalanceByAccountId(int id);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("update BankAccount set balance = balance+?2 where id=?1")
	public void addBalanceByAccountId(int id, double balance);
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("update BankAccount set balance = balance-?2 where id=?1")
	public void getAccountBalanceById(int id, double balance);
	
}
