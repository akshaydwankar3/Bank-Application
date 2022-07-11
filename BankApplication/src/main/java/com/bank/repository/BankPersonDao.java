package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.BankPerson;

@Repository
public interface BankPersonDao extends JpaRepository<BankPerson, Integer>{

}
