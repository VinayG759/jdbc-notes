package com.jsp.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SecondStep {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc-first-database";
			String userName="root";
			String password="vinayg1752004@gmail.com";
			Connection con=DriverManager.getConnection(url, userName, password);
			System.out.println(con);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
