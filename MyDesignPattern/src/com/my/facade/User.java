package com.my.facade;

import org.junit.Test;

public class User {

	@Test
	public void TestComputer() {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}
}
