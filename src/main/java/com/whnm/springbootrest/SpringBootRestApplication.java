package com.whnm.springbootrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.whnm.springbootrest.model.Quote;
import com.whnm.springbootrest.service.QuoteService;

@SpringBootApplication
public class SpringBootRestApplication {
	
	@Autowired
	private QuoteService quoteService;
	
	private static final Logger log = LoggerFactory.getLogger(SpringBootRestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApplication.class, args);
		
	}

	@Bean
	public RestTemplate inicializarRestTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
//			Quote quote = restTemplate.getForObject(
//					"https://quoters.apps.pcfone.io/api/random", Quote.class);
			Quote quote = quoteService.traerQuote();
			log.info(quote.toString());
		};
	}

}