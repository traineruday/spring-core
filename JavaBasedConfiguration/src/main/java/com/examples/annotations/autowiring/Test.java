package com.examples.annotations.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Employee employee = (Employee) context.getBean("employee");
		
		System.out.println(employee.getDepartment().getDepartmentName());
	}

}
