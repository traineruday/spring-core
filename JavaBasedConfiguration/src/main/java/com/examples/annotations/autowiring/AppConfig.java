package com.examples.annotations.autowiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Employee employee(Department department) {
		return new Employee(department);
	}
	
//	@Bean
//	public Employee employee() {
//		return new Employee();
//	}
//	
	@Bean
	public Department department() {
		return new Department();
	}
}
