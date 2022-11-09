package com.spring.core.firstdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		System.out.println("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/firstdi/config.xml");

		Student s1_bean = (Student) context.getBean("s1");
		System.out.println(s1_bean);
		System.out.println("END");

	}

}
