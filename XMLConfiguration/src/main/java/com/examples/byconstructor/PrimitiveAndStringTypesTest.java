package com.examples.byconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrimitiveAndStringTypesTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("byconstructor/primitiveAndStringTypes.xml");

		System.out.println("Without consturctor arguments");
		Employee employee1 = (Employee) context.getBean("employee1");
		employee1.show();
		
		System.out.println("\n With Single consturctor arguments");
		Employee employee2 = (Employee) context.getBean("employee2");
		employee2.show();
		
		System.out.println("\n With Single consturctor arguments");
		Employee employee3 = (Employee) context.getBean("employee3");
		employee3.show();
		
		System.out.println("\n With Double consturctor arguments");
		Employee employee4 = (Employee) context.getBean("employee4");
		employee4.show();
	}

}
