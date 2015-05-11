package com.my.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

public class ConnectionPool {

	private Vector<Connection> pool;
	/* public property */
	private String url = "jdbc:mysql://localhost:3306/test";

	private String username = "root";
	private String password = "admin";
	private String driverClassName = "com.mysql.jdbc.Driver";
	private int poolSize = 100;
	private static ConnectionPool instance = null;
	Connection conn = null;

	/* constructor method,do some init work */
	public ConnectionPool() throws ClassNotFoundException, SQLException {

		pool = new Vector<Connection>(poolSize);
		for (int i = 0; i < poolSize; i++) {
			Class.forName(driverClassName);
			conn = DriverManager.getConnection(url, username, password);
			pool.add(conn);
		}
	}

	/* return connection pool */
	public synchronized void release() {
		pool.add(conn);
	}

	/* 返回连接池中的一个数据库连接 */
	public synchronized Connection getConnection() {
		if (pool.size() > 0) {
			Connection conn = pool.get(0);
			pool.remove(conn);
			return conn;
		} else {
			return null;
		}
	}

}
