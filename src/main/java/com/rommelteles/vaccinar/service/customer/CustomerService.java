package com.rommelteles.vaccinar.service.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rommelteles.vaccinar.model.Customer;
import com.rommelteles.vaccinar.repository.CustomerRepository;

@Service
public class CustomerService implements ICustomerService {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3956786223434578990L;
	
	
	@Autowired
	private CustomerRepository repository;

	@Override
	public List<Customer> getAll() {
		return this.repository.findAll();
	} 
	

}
