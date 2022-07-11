package com.bank.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class BankPerson {

	@Id
	private Integer id;
	
	private String ammountType;
	
	private String ammountStatus;
	
	private double currentAmount;
	
	private double updatedAmount;
	
	public BankPerson() {
		// TODO Auto-generated constructor stub
	}

	public BankPerson(Integer id, String ammountType, String ammountStatus, double currentAmount,
			double updatedAmount) {
		super();
		this.id = id;
		this.ammountType = ammountType;
		this.ammountStatus = ammountStatus;
		this.currentAmount = currentAmount;
		this.updatedAmount = updatedAmount;
	}
	
	
}
