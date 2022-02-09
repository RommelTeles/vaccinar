package com.rommelteles.vaccinar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rommelteles.vaccinar.model.Customer;
import com.rommelteles.vaccinar.service.customer.ICustomerService;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
	
	@Autowired
	private ICustomerService service; 
	
	
	@GetMapping("/customers")
	public List<Customer> getAll(){
			return service.getAll(); 
	
		}
	}