package com.rommelteles.vaccinar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rommelteles.vaccinar.model.Customer;
import com.rommelteles.vaccinar.repository.CustomerRepository;

@Service
public class CustomerService implements ICustomerService {
	
	@Autowired
	private CustomerRepository repository;

	@Override
	public List<Customer> getAll() {
		return this.repository.findAll();
	} 
	

}
