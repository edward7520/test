package com.my.decorator;

import org.junit.Test;

/**
 * װ����ģʽ��Ӧ�ó����� 
 * 1.��Ҫ��չһ����Ĺ��� 
 * 2.��̬��Ϊһ����������µĹ���,���һ��ܶ�̬���� 
 * ȱ����:��������Ķ��󣬲����Ŵ�
 * 
 * @author Administrator
 *
 */
public class DecoratorTest {

	@Test
	public void test() {
		Sourceable source = new Source();
		Sourceable obj = new Decorator(source);
		obj.method();
	}

}
