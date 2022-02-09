package com.rommelteles.vaccinar.service.schudele;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rommelteles.vaccinar.repository.ScheduleRepository;

@Service
public class SchuduleService implements IScheduleService {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8633744858804959271L;
	
	@Autowired
	private ScheduleRepository repository; 

}
