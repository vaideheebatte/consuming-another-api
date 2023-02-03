package com.prowings.service;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.prowings.model.StudentConsumer;

@Service
public class ServiceConsumerImpl implements ServiceConsumer{

	@Autowired
	RestTemplate template;
	
	@Value("${base.url}")
	String url;
	

	public StudentConsumer callStudentById(int id) throws RestClientException, URISyntaxException {
		String uri = url+id;
		
		return template.getForObject(new URI(uri), StudentConsumer.class) ;
	}
	
}
