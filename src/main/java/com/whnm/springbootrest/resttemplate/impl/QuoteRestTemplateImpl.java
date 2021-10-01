package com.whnm.springbootrest.resttemplate.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.whnm.springbootrest.model.Quote;
import com.whnm.springbootrest.resttemplate.QuoteRestTemplate;

@Repository
public class QuoteRestTemplateImpl implements QuoteRestTemplate {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public Quote traerQuote() {
		return restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random", Quote.class);
	}

}
