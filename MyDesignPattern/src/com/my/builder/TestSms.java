package com.my.builder;

import junit.framework.TestSuite;

public class TestSms extends TestSuite{

	@org.junit.Test
	public void testSmsSender() {

		Builder builder = new Builder();
		builder.produceSmsSender(10);
	}

}
