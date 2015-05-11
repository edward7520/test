package com.my.proxy;

import com.template.Line;

/**
 * 实际代理类
 * 
 * @edward version 1.0
 *
 */
public class Proxy implements Sourceable {

	private Source source;

	public Proxy() {
		super();
		this.source = new Source();
	}

	@Override
	public void method() {
		Line.drawWeaveLine();
		before();
		source.method();
		after();
		Line.drawWeaveLine();
	}

	private void after() {
		System.out.println("afte the proxy");
	}

	private void before() {
		System.out.println("before the proxy");
	}
}