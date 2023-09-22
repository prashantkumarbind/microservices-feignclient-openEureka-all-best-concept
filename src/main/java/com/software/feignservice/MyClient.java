package com.software.feignservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



		/*it is for get user name */
		/*
		 * @FeignClient(url = "http://localhost:8082",value="client") public interface
		 * MyClient {
		 * 
		 * @GetMapping("/username/{accountNumber}") public String
		 * getUserName(@PathVariable String accountNumber);
		 * 
		 * }
		 */

		/* it is use for get bank name */
		@FeignClient(url = "http://localhost:8080",value="client")
		public interface MyClient {
			
			@GetMapping("/cardname/{accountNumber}")
			public String getUserCardName(@PathVariable String accountNumber);
		
		}

