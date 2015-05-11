package com.my.all.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.my.bridge.BridgeTest;
import com.my.decorator.DecoratorTest;
import com.my.facade.User;
import com.my.proxy.ProxyTest;

@RunWith(Suite.class)
@SuiteClasses({ DecoratorTest.class, ProxyTest.class, User.class,
		BridgeTest.class })
public class SuiteTestTwo {

}
