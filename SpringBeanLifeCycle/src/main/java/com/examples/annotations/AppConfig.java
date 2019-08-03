package com.examples.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public InitializeDestroy initializeDestroy() {
		return new InitializeDestroy();
	}
}
