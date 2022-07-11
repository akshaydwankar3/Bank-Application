package com.bank.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class BankCustomer {

	@Id
	private Integer id;
	
	private String name;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private String mobile;
	
	private String password;
	
	public BankCustomer() {
		// TODO Auto-generated constructor stub
	}

	public BankCustomer(Integer id, String name, String city, String state, String country, String mobile,
			String password) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.state = state;
		this.country = country;
		this.mobile = mobile;
		this.password = password;
	}
		
}
