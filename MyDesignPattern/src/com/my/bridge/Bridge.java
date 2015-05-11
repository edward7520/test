package com.my.bridge;

/**
 * ����һ���ţ�����Sourceable��һ��ʵ��
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
