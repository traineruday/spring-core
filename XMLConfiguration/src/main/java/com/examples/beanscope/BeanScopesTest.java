package com.examples.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopesTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanscopes/beanscopes.xml");

		System.out.println("Singleton");
		Employee employee = (Employee) context.getBean("employee1");
		System.out.println(employee);

		employee = (Employee) context.getBean("employee1");
		System.out.println(employee);
		
		System.out.println("Prototype");
		employee = (Employee) context.getBean("employee2");
		System.out.println(employee);
		
		employee = (Employee) context.getBean("employee2");
		System.out.println(employee);
	}

}
