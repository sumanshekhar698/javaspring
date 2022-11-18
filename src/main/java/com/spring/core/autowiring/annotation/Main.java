package com.spring.core.autowiring.annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.core.autowiring.Worker;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/core/autowiring/annotation/config.xml");
		Employee e1 = context.getBean("e1", Employee.class);
		Employee e2 = context.getBean("e1", Employee.class);
		Employee e3 = context.getBean("e1", Employee.class);
		Employee e4 = context.getBean("e1", Employee.class);
		
		
		e1.setAdr(null);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);

	}
}
