package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages="com.springboot")
public class EmployeeServicesApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeeServicesApplication.class, args);
	}
}
