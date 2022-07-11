package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.BankCustomer;

@Repository
public interface BankCustomerDao extends JpaRepository<BankCustomer, Integer>{

}
