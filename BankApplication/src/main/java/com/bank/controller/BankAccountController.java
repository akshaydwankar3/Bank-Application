package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.BankAccount;
import com.bank.model.BankPerson;
import com.bank.service.BankAccountService;

@RestController
public class BankAccountController {

	@Autowired
	private BankAccountService baService;
	
	@Autowired
	private BankPersonController bpController;
	
	
	public void saveBankAccountHandler(int id, double balance, String accountStatus) {
		BankAccount ab=new BankAccount(id, balance, accountStatus);
		baService.createAccount(ab);
	}
	
	@GetMapping("/bank/account/{id}/checkbalance")
	public double checkBalance(@PathVariable int id) {
		return baService.getBankAccountBalance(id);
	}
	
	@PutMapping("/bank/account/{id}/deposit/{amount}")
	public void creditAmountHandler(@PathVariable int id, @PathVariable double amount) {
		double currentBalance=checkBalance(id);
		baService.creditBalance(id, amount);
		BankPerson person=new BankPerson(id, "Deposit", "Success", currentBalance, currentBalance+amount);
		bpController.savePersonHandler(person);
	}
	
	@PutMapping("/bank/account/{id}/withdraw/{amount}")
	public void debitAmountHandler(@PathVariable int id, @PathVariable double amount) {
		double currentBalance=checkBalance(id);
		baService.debitBalance(id, amount);
		BankPerson bp=new BankPerson(id, "Withdraw", "Success", currentBalance, currentBalance-amount);
		bpController.savePersonHandler(bp);
	}
	
	@GetMapping("/bank/account/{id}/statement")
	public BankAccount getAllDetailsHandler(@PathVariable int id) {
		return baService.getAllDetails(id);
	}
}
