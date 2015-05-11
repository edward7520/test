package com.my.singleton;

import java.util.Vector;

public class SingletonTest {

	private static SingletonTest instance = null;

	public static SingletonTest getInstance() {
		if (instance == null) {
			synclnit();
		}
		return instance;
	}

	private static synchronized void synclnit() {

		if (instance == null) {
			instance = new SingletonTest();
		}
	}

	private Vector properties = null;

	private SingletonTest() {
	}

	public Vector getProperties() {
		return properties;
	}

	public void updateProperties() {
		SingletonTest shadow = new SingletonTest();
		properties = shadow.getProperties();

	}
}
