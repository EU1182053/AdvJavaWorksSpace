package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

	public static Connection connect() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project_db","root","root");
		System.out.println("mini project db connected.");
		return conn;
	}
}