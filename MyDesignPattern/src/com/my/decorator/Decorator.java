package com.my.decorator;

import com.template.Line;

/**
 * װ���࣬����ΪSource�ද̬�����һЩ����
 * 
 * @edward version 1.0
 *
 */
public class Decorator implements Sourceable {

	private Sourceable source;

	public Decorator(Sourceable source) {
		super();
		this.source = source;
	}

	public void method() {
		Line.drawHorizenLine();
		System.out.println("Before decorator!");
		source.method();
		System.out.println("After decorator!");
		Line.drawHorizenLine();
	}
}