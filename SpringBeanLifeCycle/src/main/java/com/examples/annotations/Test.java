package com.examples.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		InitializeDestroy initializeDestroy = (InitializeDestroy) context.getBean("initializeDestroy");
		
		initializeDestroy.display();
		
		context.close();
	}

}
