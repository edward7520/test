package com.my.builder;

import junit.framework.TestSuite;

//@RunWith(JUnit4.class)
public class TestMail extends TestSuite{

	@org.junit.Test
	public void testMailSender() {
//		System.out.println("hello test!");

		Builder builder = new Builder();
		builder.produceMailSender(10);
	}

	

}
