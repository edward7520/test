package com.my.interfaceAdapter;

import org.junit.Test;

import com.template.Line;

public class InterfaceWrapperTest {

	@Test
	public void test() {
		Line.drawHorizenLine();
		System.out.println("interface sourceable's adapter starts");

		Sourceable source1 = new SourceSub1();
		Sourceable source2 = new SourceSub2();

		source1.method1();
		source1.method2();

		source2.method1();
		source2.method2();
		System.out.println("interface sourceable's adapter ends");
		Line.drawHorizenLine();
	}
}
