package com.my.proxy;

import org.junit.Test;

/**
 * 
 * @author edward
 * @version 1.0
 *
 */
//������ģʽ��
public class ProxyTest {

	@Test
	public void test() {
		Sourceable source = new Proxy();
		source.method();
	}

}
