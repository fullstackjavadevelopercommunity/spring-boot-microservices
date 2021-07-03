package com.hcl.traning.microservices.controller;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.traning.microservices.bean.ExchangeValue;
import com.hcl.traning.microservices.dao.ExchangeValueRepository;

/**
 * @author Manjeet Kumar
 *
 *         Jun 30, 2020
 */
@RestController
public class CurrencyExchangeController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private ExchangeValueRepository exchangeValueRepository;

	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from,@PathVariable String to) {
		 ExchangeValue exchangeValue = new ExchangeValue(1000L,from, to, BigDecimal.valueOf(65));
		 exchangeValueRepository.findByFromAndTo(from, to);
		 exchangeValue.setPort(Integer.parseInt((environment.getProperty("local.server.port"))));
		 logger.info("{}",exchangeValue);
		 return exchangeValue;
	}
}
