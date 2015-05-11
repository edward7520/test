package com.my.bridge;

/**
 * 定义一个桥，持有Sourceable的一个实例
 * @author edward
 * @version 1.0
 *
 */
public abstract class Bridge {

	private Sourceable source;

	public Sourceable getSource() {
		return source;
	}

	public void setSource(Sourceable source) {
		this.source = source;
	}

	public void method() {
		source.method();
	}
}
