package com.jsp.second;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc-second-database";
			String user="root";
			String password="vinayg1752004@gmail.com";
			 con=DriverManager.getConnection(url, user, password);
			Statement state=con.createStatement();
			String query="CREATE TABLE book (bookid INT(2) PRIMARY KEY,bookname VARCHAR(100) NOT NULL,arthur VARCHAR(20) NOT NULL,price INT NOT NULL)";
			state.execute(query);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
