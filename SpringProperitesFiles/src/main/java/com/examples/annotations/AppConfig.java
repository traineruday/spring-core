package com.examples.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = { "classpath:application.properties" })
public class AppConfig {

	@Bean
	public SampleBean sampleBean() {
		return new SampleBean();
	}
}
