package com.spring.core.firstdi;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class StudentTest {

	@Test
	public void testStudent_positive_study() {
		Student student = new Student();
		String study = student.study();

//		Assert.assertEquals(stu, 0, 0);
//		Assert.eqa

		if (!"STUDENT studying JAVA SPRING".equals(study))
			Assert.fail();

	}

	
	@Test
	public void testStudent_negative_study() {
		Student student = new Student();
		String study = student.study();

//		Assert.assertEquals(stu, 0, 0);
//		Assert.eqa

		if (!"STUDENT studyingJAVA SPRING".equals(study))
			Assert.fail();

	}
}
