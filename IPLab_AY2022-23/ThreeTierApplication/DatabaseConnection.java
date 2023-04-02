package com.rmkcet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
	public static Connection getDatabaseConnection() throws IOException {
		
		Connection connection = null;		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3400/rmkcet","root","Madhu@1981");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
