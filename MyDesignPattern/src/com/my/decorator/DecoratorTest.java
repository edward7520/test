package com.my.decorator;

import org.junit.Test;

/**
 * 装饰器模式的应用场景： 
 * 1.需要拓展一个类的功能 
 * 2.动态的为一个对象添加新的功能,而且还能动态撤销 
 * 缺点是:产生过多的对象，不易排错
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
