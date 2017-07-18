package com.employee.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.Sampler;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class EmployeeApplication {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

	@Bean
	public Sampler defaultSampler() {
		return new AlwaysSampler();
	}
}

