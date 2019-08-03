package com.examples.annotations;

import org.springframework.beans.factory.annotation.Value;

public class SampleBean {

	@Value("${property1}")
	private String property1;

	@Value("${property2}")
	private String property2;
	
	@Value("${property3:Default value}")
	private String property3;
	
	public void show() {
		System.out.println(property1);
		System.out.println(property2);
		System.out.println(property3);
	}
}
