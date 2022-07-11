package com.bank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.model.BankCustomer;
import com.bank.service.BankCustomerService;

@RestController
public class BankCustomerController {

	@Autowired
	private BankCustomerService bcService;
	
	@Autowired
	private BankAccountController baController;
	
	@PostMapping("/bank/customer/create")
	public void saveCustomerHandler(@RequestBody BankCustomer bc) {
		bcService.createCustomer(bc);
		baController.saveBankAccountHandler(bc.getId(), 0, "Active");
	}
	
	@GetMapping("bank/customer/detail/{id}")
	public BankCustomer getCustomerDetailsHandler(@PathVariable int id) {
		return bcService.getBankCustomerDetail(id);
	}
	
	@DeleteMapping("/bank/customer/delete/{id}")
	public void deleteCustomerHandler(@PathVariable int id) {
		bcService.deleteBankCustomerDetail(id);
	}
	
}
