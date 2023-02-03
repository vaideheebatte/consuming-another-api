package com.prowings.controller;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;

import com.prowings.model.StudentConsumer;
import com.prowings.service.ServiceConsumer;
@RestController
public class ConsumerStudentController {
	
	@Autowired
	ServiceConsumer service;
	
	@GetMapping("/studentconsumer/{id}")
	public StudentConsumer callStudentById(@PathVariable("id") int id) throws RestClientException, URISyntaxException {
		return service.callStudentById(id);
	}
}
