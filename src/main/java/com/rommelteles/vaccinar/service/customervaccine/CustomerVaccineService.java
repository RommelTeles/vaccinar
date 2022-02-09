package com.rommelteles.vaccinar.service.customervaccine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rommelteles.vaccinar.repository.CustomerVaccineRepository;

@Service
public class CustomerVaccineService  implements ICustomerVaccineService{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2817970929822835982L;
	
	
	
	@Autowired
	private CustomerVaccineRepository repository; 
	


}
