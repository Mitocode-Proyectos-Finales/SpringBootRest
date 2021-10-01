package com.whnm.springbootrest.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whnm.springbootrest.model.Quote;
import com.whnm.springbootrest.resttemplate.QuoteRestTemplate;
import com.whnm.springbootrest.service.QuoteService;

@Service
public class QuoteServiceImpl implements QuoteService{
	
	private static final Logger logger = LoggerFactory.getLogger(QuoteServiceImpl.class);
	
	@Autowired
	private QuoteRestTemplate quoteRestTemplate;
	
	@Override
	public Quote traerQuote() {
		Quote quote = quoteRestTemplate.traerQuote();
		logger.debug(quote.getType());
		logger.debug(quote.getValue().getQuote());
		return quote;
	}

}
