package com.my.all.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.my.builder.TestMail;
import com.my.builder.TestSms;

/**
 * ��һ����Ŀ�У�ֻдһ���������ǲ����ܵģ����ǻ�д���ܶ�ܶ�������ࡣ
 * ������Щ���������һ��һ����ִ�У�Ҳ�ǱȽ��鷳�����顣
 * ���ڴˣ� JUnit Ϊ�����ṩ�˴�����ԵĹ��ܣ���������Ҫ���еĲ����༯��������
 * һ���Ե�������ϣ����ķ��������ǵĲ��Թ���
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
