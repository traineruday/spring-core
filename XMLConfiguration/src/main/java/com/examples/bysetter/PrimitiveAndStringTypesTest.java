package com.examples.bysetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrimitiveAndStringTypesTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bysetter/primitiveAndStringTypes.xml");

		System.out.println("Setter injection example");
		Employee employee = (Employee) context.getBean("employee");
		employee.show();
	}

}
