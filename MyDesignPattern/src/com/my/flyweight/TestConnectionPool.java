package com.my.flyweight;

import java.lang.reflect.Method;

public class TestConnectionPool {

	public static void main(String[] args) throws InstantiationException {

		Class cl;
		String className = "com.my.flyweight.ConnectionPool";
		try {
			cl = (Class) Class.forName(className);
			String name = cl.getClass().getSimpleName();
			Method[] methods = cl.getDeclaredMethods();
			System.out.println(name);
			System.out.println(methods);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
