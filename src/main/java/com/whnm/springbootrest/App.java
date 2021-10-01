package com.whnm.springbootrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.whnm.springbootrest.model.Quote;

//@Component
public class App {
	
	private static final Logger logger = LoggerFactory.getLogger(App.class);
	@Autowired
//	private QuoteService quoteService;
//	
//	@Override
//	public void run(String... args) throws Exception {
//		quoteService.traerQuote();
//	}

	public static void main(String[] args) {
//		quoteService.traerQuote();
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random", Quote.class);
		logger.debug(quote.getType());
		logger.debug(quote.getValue().getQuote());
	}
}
