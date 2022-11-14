package com.spring.core.firstdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		System.out.println("START");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/core/firstdi/config.xml");

//		Scope of spring by default is Singelton
		Student s1_bean = (Student) context.getBean("s1");
		System.out.println(s1_bean);
		
		
		Student s1_bean_dup = (Student) context.getBean("s1");
		Student s2_bean = (Student) context.getBean("s2");
		Student s2_bean_dup = (Student) context.getBean("s2");

		System.out.println(s1_bean);
		System.out.println(s2_bean);
//
		if (s1_bean.hashCode() == s2_bean.hashCode())
			System.out.println(true);// true
		else
			System.out.println(false);

		Student student1 = new Student();
		Student student2 = new Student();
		student1 = null;

//		Singeleton Design pattern
		if (student1.hashCode() == student2.hashCode())
			System.out.println(true);
		else
			System.out.println(false);

	}

}
