package com.my.bridge;

import org.junit.Test;

import com.template.Line;

public class BridgeTest {

	@Test
	public void TestBridge() {
		Line.drawStar();
		Bridge bridge = new MyBridge();
		Sourceable source1 = new SourceSub1();
		bridge.setSource(source1);
		bridge.method();

		// 调用第二个对象
		Sourceable source2 = new SourceSub2();
		bridge.setSource(source2);
		bridge.method();
		Line.drawStar();

	}
}
