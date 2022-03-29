package com.example.Assignment6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

	private static DatabaseConnection databaseConnection = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	    final String DB_URL = "database-shoppingcart.corgqbwm1qjg.us-east-1.rds.amazonaws.com";
	    final String USER = "admin";
	    final String PASS = "admin123";
		    Connection conn = null;
		    
		    try {
		    	Class.forName("com.mysql.jdbc.Driver");
		    	System.out.println("Connecting to database...");
		    	
				conn = DriverManager.getConnection(DB_URL,USER,PASS);
				
			      System.out.println("Creating table in given database...");
			      Statement stmt = conn.createStatement();
			      //String sql = "INSERT INTO `testTable` (`AccountID`,`firstName`,`lastName`,`age`) VALUES ( 4,'Jay','C',21);";

			      String sql = "CREATE TABLE TestTable " +
		                   " (firstName VARCHAR(255), " + 
		                   " lastName VARCHAR(255), " + 
		                   " PhoneNumber VARCHAR(255), " +
		                   " EmailAddress VARCHAR(255), " +
		                   " UserName VARCHAR(255), " +
		                   " age INTEGER(30));"; 		     		      

			      stmt.executeUpdate(sql);
			      System.out.println("Created table in given database...");
				
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
	}
	
	public Connection getConnection() throws SQLException {
		Connection conn = null;
		conn = DriverManager.getConnection("jdbc:mysql://database-1.corgqbwm1qjg.us-east-1.rds.amazonaws.com:3306/testdb2", "admin", "admin123");
		return conn;
	}

	public static DatabaseConnection getInstance() {
		
		if (databaseConnection == null) {
			databaseConnection = new DatabaseConnection();
		}
		
		return databaseConnection;
	}
}
