package com.rmkcet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	public static Connection getDatabaseConnection() {
		Connection connection = null;
		String userName = "root";
		String password = "Madhu@1981";
		// rmkcet is the database name
		String connectionUrl = "jdbc:mysql://localhost/rmkcet";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(connectionUrl, userName, password);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
