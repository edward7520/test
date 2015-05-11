package com.my.all.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.my.builder.TestMail;
import com.my.builder.TestSms;
import com.my.classAdapter.ClassAdapterTest;
import com.my.interfaceAdapter.InterfaceWrapperTest;
import com.my.objectAdapter.ObjectAdapterTest;

/**
 * ¥Ú∞¸≤‚ ‘¿‡
 * 
 * @version 1.0 edward
 *
 */

@RunWith(Suite.class)
@SuiteClasses({ TestMail.class, TestSms.class, ClassAdapterTest.class,
		ObjectAdapterTest.class, InterfaceWrapperTest.class })
public class SuiteTest {

}
