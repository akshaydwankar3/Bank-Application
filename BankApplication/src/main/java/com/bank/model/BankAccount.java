package com.bank.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class BankAccount {

	@Id
	private Integer id;
	
	private double balance;
	
	private String accountStatus;
	
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}

	public BankAccount(Integer id, double balance, String accountStatus) {
		super();
		this.id = id;
		this.balance = balance;
		this.accountStatus = accountStatus;
	}
			
}
