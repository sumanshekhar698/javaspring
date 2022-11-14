package com.spring.core.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		System.out.println("START");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/core/collections/config.xml");

		Employee emp1 = (Employee) context.getBean("e1");
		Employee emp2 = (Employee) context.getBean("ededetails");
		System.out.println(emp2);
		System.out.println("END");

	}

}
