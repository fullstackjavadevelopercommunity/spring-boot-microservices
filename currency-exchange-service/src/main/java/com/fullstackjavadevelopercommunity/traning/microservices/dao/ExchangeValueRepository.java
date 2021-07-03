package com.fullstackjavadevelopercommunity.traning.microservices.dao;

import com.fullstackjavadevelopercommunity.traning.microservices.bean.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Full Stack Java Developer Community
 *
 * Jun 30, 2020
 */
@Repository
public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
	
	ExchangeValue findByFromAndTo(String from, String to);

}
