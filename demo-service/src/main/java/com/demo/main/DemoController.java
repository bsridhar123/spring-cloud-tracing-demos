package com.demo.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RefreshScope
public class DemoController {

	private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Autowired
	private RestTemplate restTemplate;

    @Value("${empUrl}")
    String empUrl;
    
   

	@GetMapping("/demo/employee")
	public String getEmployeeDetails() {
		logger.info("Inside demo-service");
		String employeeDetails=restTemplate.getForObject(empUrl, String.class);
		logger.info("employee service returned: " + employeeDetails);
		return employeeDetails;
	}
	
}

