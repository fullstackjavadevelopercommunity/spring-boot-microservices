package com.fullstackjavadevelopercommunity.traning.microservices.service;

import com.fullstackjavadevelopercommunity.traning.microservices.bean.CurrencyConversionBean;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Manjeet Kumar
 *
 *         Jul 1, 2020
 */
//@FeignClient(value = "currency-exchange-service", url = "localhost:8282")
@FeignClient(value = "currency-exchange-service")
//@FeignClient(value = "netflix-zuul-api-getway-server")
@RibbonClient(value = "currency-exchange-service")
public interface CurrencyExchangeServiceProxy {

	@GetMapping("currency-exchange/from/{from}/to/{to}")
	//@GetMapping("currency-exchange-service/currency-exchange/from/USD/to/INR")
	public CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
}
