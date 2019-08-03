package com.examples.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

public class InitializeDestroy {
	
	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialization method called");
	}

	public void display() {
		System.out.println("Welcome");
	}

	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("Destroy method called");		
	}
}
