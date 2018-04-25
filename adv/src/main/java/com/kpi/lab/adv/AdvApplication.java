package com.kpi.lab.adv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AdvApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdvApplication.class, args);
	}
}
