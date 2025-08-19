package com.jsp.third;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class updateData {
	public static void main(String[] args) {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc-third-database";
			String user="root";
			String password="vinayg1752004@gmail.com";
			con=DriverManager.getConnection(url, user, password);
			String query="UPDATE student SET stname=(?),email=(?) WHERE stid=22";
			PreparedStatement ps=con.prepareStatement(query);
			System.out.println("Enter new student name : ");
			Scanner sc=new Scanner (System.in);
			String name=sc.next();
			System.out.println("Enter new email : ");
			String email=sc.next();
			ps.setString(1, name);
			ps.setString(2, email);
			
			int result=ps.executeUpdate();
			System.out.println("Number of columns affected is "+ result);

			
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
