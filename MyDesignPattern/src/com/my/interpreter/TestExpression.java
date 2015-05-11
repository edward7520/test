package com.my.interpreter;

import org.junit.Assert;
import org.junit.Test;

//@SuiteClasses(TestSuite.class)
//@RunWith(TestExpression.class)
/**
 * 解释器模式：用来做各种各样的表达式，如正则表达式等等
 * @author edward
 * @version 1.0
 *
 */
public class TestExpression {

	@Test
	public void testExpression() {

		int result = new Minus().interpret(new Context(new Plus()
				.interpret(new Context(9, 2)), 8));

		Assert.assertEquals(3, result);
	}
}