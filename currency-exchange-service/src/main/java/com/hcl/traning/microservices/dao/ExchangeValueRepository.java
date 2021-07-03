package com.hcl.traning.microservices.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.traning.microservices.bean.ExchangeValue;

/**
 * @author Manjeet Kumar
 *
 * Jun 30, 2020
 */
@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	
	ExchangeValue findByFromAndTo(String from, String to);

}
