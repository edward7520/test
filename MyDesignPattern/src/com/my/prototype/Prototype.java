package com.my.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//原型模式(Prototype)是创建型的模式
//浅复制：基本数据类型的变量都会被重新创建，而引用类型则不变
//深复制：不论是基本数据类型还是引用类型，都需要重新创建
public class Prototype implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;

	private String string;

	private SerializableObject obj;

	/* 浅复制* */
	public Object clone() throws CloneNotSupportedException {
		Prototype proto = (Prototype) super.clone();
		return proto;
	}

	/** 深复制 **/
	public Object deepClone() throws IOException, ClassNotFoundException {

		/**
		 * 写入当前对象的二进制流
		 */
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(this);

		/**
		 * 读出当前对象的二进制流
		 */
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bis);
		return ois.readObject();

	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public SerializableObject getObj() {
		return obj;
	}

	public void setObj(SerializableObject obj) {
		this.obj = obj;
	}

	class SerializableObject implements Serializable {
		private static final long serialVersionUID = 1L;
	}

}
