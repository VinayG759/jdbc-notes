package com.jsp.first;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class j3rd4thand5thStep {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc-first-database";
			String userName="root";
			String password="vinayg1752004@gmail.com";
			Connection con=DriverManager.getConnection(url, userName, password);
			Statement state=con.createStatement();
			System.out.println(state);
			String query="CREATE TABLE student (stid INT PRIMARY KEY,stname VARCHAR(20) NOT NULL ,stmarks DECIMAL(3,2));";
			state.execute(query);
			
			con.close();
			System.out.println("table created");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
