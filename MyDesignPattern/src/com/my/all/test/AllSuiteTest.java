package com.my.all.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.my.builder.TestMail;
import com.my.builder.TestSms;

/**
 * 在一个项目中，只写一个测试类是不可能的，我们会写出很多很多个测试类。
 * 可是这些测试类必须一个一个的执行，也是比较麻烦的事情。
 * 鉴于此， JUnit 为我们提供了打包测试的功能，将所有需要运行的测试类集中起来，
 * 一次性的运行完毕，大大的方便了我们的测试工作
 * @version 1.0 edward
 *
 */
//@SuiteClasses({TestMail.class,TestSms.class})
@RunWith(Suite. class )
@SuiteClasses({TestMail.class,TestSms.class})
public class AllSuiteTest {

	public AllSuiteTest() {
		super();
	}

}
