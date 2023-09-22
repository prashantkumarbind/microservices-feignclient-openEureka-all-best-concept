package com.software.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.software.feignservice.MyClient;

@RestController //it is return the data not view
public class AddDataAccess {
	
		
		@Autowired
		RestTemplate rt;
		
		@Autowired
		MyClient client;
		
		
		@GetMapping("/alldata/{accountNumber}")
		public String addAllDataAccess(@PathVariable String accountNumber) {
			/*
			 * String userName =
			 * rt.getForObject("http://localhost:8082/username/"+accountNumber,String.class)
			 * ; String cardName =
			 * rt.getForObject("http://localhost:8080/cardname/"+accountNumber,String.class)
			 * ; String bankName=
			 * rt.getForObject("http://localhost:8081/bankname/"+accountNumber,String.class)
			 * ;
			 */
			
				
				String user_card_name=client.getUserCardName(accountNumber); 
			
				/*
				 * return "\n User Name::"+userName+"\n Card Name::"+cardName+"\n Bank  Name::"
				 * +bankName;
				 */
					return " FS result "+ user_card_name;
					
					
		}

}
