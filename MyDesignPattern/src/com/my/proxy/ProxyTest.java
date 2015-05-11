package com.my.proxy;

import org.junit.Test;

/**
 * 
 * @author edward
 * @version 1.0
 *
 */
//代理器模式的
public class ProxyTest {

	@Test
	public void test() {
		Sourceable source = new Proxy();
		source.method();
	}

}
