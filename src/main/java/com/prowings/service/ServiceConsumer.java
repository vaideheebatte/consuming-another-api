package com.prowings.service;

import java.net.URISyntaxException;

import org.springframework.web.client.RestClientException;

import com.prowings.model.StudentConsumer;

public interface ServiceConsumer {

	StudentConsumer callStudentById(int id) throws RestClientException, URISyntaxException;

	
}
