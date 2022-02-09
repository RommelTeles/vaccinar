package com.rommelteles.vaccinar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rommelteles.vaccinar.service.customervaccine.ICustomerVaccineService;

@RestController
@RequestMapping("/api/v1")
public class CustomerVaccineController {
	
	@Autowired
	private ICustomerVaccineService service; 

}
