package com.examples.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		SampleBean sampleBean = (SampleBean) context.getBean("sampleBean");

		sampleBean.show();

	}

}
