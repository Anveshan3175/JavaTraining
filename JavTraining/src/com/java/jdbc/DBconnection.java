package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBconnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = getConnection();
		ResultSet rs = null;
		try {
			PreparedStatement ps = con.prepareStatement("select * from addresses");
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	 
	}

	
	public static Connection getConnection(){
		Connection connection = null;
		 try {

	         connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "fod", "fusion");
	         if (connection != null) {
	             System.out.println("You made it, take control your database now!");
	         } else {
	             System.out.println("Failed to make connection!");
	         }

	     } catch (SQLException e) {

	         System.out.println("Connection Failed! Check output console");
	         e.printStackTrace();
	     }
		 
		 return connection;
	}
	
	

}
