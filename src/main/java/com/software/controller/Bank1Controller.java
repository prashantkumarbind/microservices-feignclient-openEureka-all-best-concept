package com.software.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController  //it only return the data not view
public class Bank1Controller {
	
		@GetMapping("/bankname/{accountNumber}")
		public String getBankName(@PathVariable String accountNumber) {
			
			   return "Bank Of Baroda";
		}

}
