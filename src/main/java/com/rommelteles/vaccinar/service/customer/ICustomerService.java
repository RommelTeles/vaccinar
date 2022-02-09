package com.rommelteles.vaccinar.service.customer;

import java.io.Serializable;
import java.util.List;

import com.rommelteles.vaccinar.model.Customer;

public interface ICustomerService extends Serializable {

	public List<Customer> getAll(); 
}
