package com.jsp.first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class task {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc-first-database";
			String user="root";
			String password="vinayg1752004@gmail.com";
			Connection con=DriverManager.getConnection(url, user, password);
			Statement state=con.createStatement();
			String query="INSERT INTO student(stid,stname,stmarks) VALUES (109,'vinay g',3.1) , (107,'RAVI',5.5);";
			state.executeUpdate(query);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
