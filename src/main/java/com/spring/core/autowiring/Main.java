package com.spring.core.autowiring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/core/autowiring/config.xml");
		Worker worker_1 = context.getBean("w1",Worker.class);
		System.out.println(worker_1);

	}
}
