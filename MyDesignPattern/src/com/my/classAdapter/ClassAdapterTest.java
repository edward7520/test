package com.my.classAdapter;

import org.junit.Test;

import com.template.Line;

/**
 * Adapter 类继承 Source 类，实现Targetable 接口
 * 
 * @author edward
 *
 */
public class ClassAdapterTest {

	@Test
	public void test() {

		System.out.println("class Adapter test:");
		Targetable target = new Adapter();
		target.method1();
		target.method2();
		Line.drawHorizenLine();
	}

}
