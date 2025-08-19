package com.jsp.second;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertdata {
	public static void main(String[] args) {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc-second-database";
			String user="root";
			String password="vinayg1752004@gmail.com";
			con=DriverManager.getConnection(url, user, password);
			Statement state=con.createStatement();
			String query="INSERT  INTO book  (bookid,bookname,arthur,price) VALUES (01,'To Kill a Mockingbird','Harper Lee',3000),(02,'1984','George Orwell',2000),(03,'Pride and Prejudice','Jane Austen',6000),(04,'The Alchemist','Paulo Coelho',5500),(05,'The Catcher in the Rye','J.D. Salinger',2560)";
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
