package com.cice.ciceeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CiceEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiceEurekaServerApplication.class, args);
	}

}
