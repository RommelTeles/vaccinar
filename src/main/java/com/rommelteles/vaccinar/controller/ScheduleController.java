package com.rommelteles.vaccinar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rommelteles.vaccinar.service.schudele.IScheduleService;

@RestController
@RequestMapping("/api/v1")
public class ScheduleController {
	
	@Autowired
	private IScheduleService service; 

}
