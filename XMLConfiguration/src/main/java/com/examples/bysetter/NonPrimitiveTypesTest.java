package com.examples.bysetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NonPrimitiveTypesTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bysetter/nonPrimitiveType.xml");

		EmployeeWithNonPrimitiveType employeeWithNonPrimitiveType = (EmployeeWithNonPrimitiveType) context.getBean("employeeWithNonPrimitiveType");
		employeeWithNonPrimitiveType.show();
	}

}
