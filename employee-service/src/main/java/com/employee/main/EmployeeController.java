package com.employee.main;

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
public class EmployeeController {

	private static final Logger logger = LoggerFactory.getLogger(MyController.class);
    
	
	
	@GetMapping("/employee")
	public String getEmployee() {
		logger.info("Inside employee-service");
		return "Welcome Employee";
	}
	
}

