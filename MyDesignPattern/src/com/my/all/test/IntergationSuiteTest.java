package com.my.all.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.my.interpreter.TestExpression;

@RunWith(Suite.class)
@SuiteClasses({ SuiteTest.class, SuiteTestTwo.class,TestExpression.class })
public class IntergationSuiteTest {

}
