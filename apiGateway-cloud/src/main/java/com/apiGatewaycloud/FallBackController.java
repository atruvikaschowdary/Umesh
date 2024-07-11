package com.apiGatewaycloud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

	@GetMapping("/userServiceFallBackMethod")
	public String userServiceFallBackMethod() {
		String fallBack = "User Service is taking longer time then Expected." + "Please Try Again Later";
		return fallBack;
	}

	@GetMapping("/departmentServiceFallBackMethod")
	public String departmentServiceFallBackMethod() {
		String fallBack = "Department Service is taking longer time then Expected." + "Please Try Again Later";
		return fallBack;
	}
}
