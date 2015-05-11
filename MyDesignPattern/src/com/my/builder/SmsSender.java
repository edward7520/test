package com.my.builder;

public class SmsSender implements Sender {

	@Override
	public void Send() {
		System.out.println("this is the smssender!");
	}

}
