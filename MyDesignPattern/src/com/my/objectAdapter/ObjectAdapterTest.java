package com.my.objectAdapter;

import org.junit.Test;

import com.my.classAdapter.Source;
import com.my.classAdapter.Targetable;
import com.template.Line;

public class ObjectAdapterTest {

	public Source source;
	public Targetable target;

	@Test
	public void test() {
		Line.drawHorizenLine();
		source = new Source();
		target = new Wrapper(source);
		target.method1();
		target.method2();
		Line.drawHorizenLine();
	}

}
