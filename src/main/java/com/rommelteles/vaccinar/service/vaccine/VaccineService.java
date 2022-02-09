package com.rommelteles.vaccinar.service.vaccine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rommelteles.vaccinar.repository.VaccineRepository;

@Service
public class VaccineService  implements IVaccineService{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7492175089057549401L;
	
	
	@Autowired
	private VaccineRepository repository; 
	
	

}
