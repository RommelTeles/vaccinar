package com.rommelteles.vaccinar.service.supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rommelteles.vaccinar.repository.SupplierRepository;

@Service
public class SupplierService  implements ISupplierService{

	/**
	 * 
	 */
	private static final long serialVersionUID = 823336639351145477L;
	
	
	@Autowired
	private SupplierRepository repository; 

}
