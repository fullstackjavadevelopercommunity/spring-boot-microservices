package com.fullstackjavadevelopercommunity.traning.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NetflixEurekaNamingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NetflixEurekaNamingServiceApplication.class, args);
	}

}
