package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.model.Account;

@RestController
@RequestMapping("/accounts")
public class Controller {

	@GetMapping("/{number}")
	public Account getAccountDetails(@PathVariable String number) {
		Account account = new Account();
		account.setNumber("00987987973432");
		account.setType("savings");
		account.setBalance(234343);
		return account;
		
	}
}
