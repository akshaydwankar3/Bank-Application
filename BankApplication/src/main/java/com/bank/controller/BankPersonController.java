package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.BankPerson;
import com.bank.service.BankPersonService;

@RestController
public class BankPersonController {

	@Autowired
	private BankPersonService bpService;
	
	public void savePersonHandler(BankPerson bp) {
		bpService.savePerson(bp);
	}
	
	@GetMapping("/bank/person/detail/{id}")
	public BankPerson showDetails(@PathVariable int id) {
		return bpService.personDetails(id);
	}
	
	@DeleteMapping("bank/person/delete/{id}")
	public void removeDetails(@PathVariable int id) {
		bpService.removeBankPerson(id);
	}
	
}
