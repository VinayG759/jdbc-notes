package com.jsp.third;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class fetchdata {
	public static void main(String[] args) {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc-third-database";
			String user="root";
			String password="vinayg1752004@gmail.com";
			con=DriverManager.getConnection(url, user, password);
			
			String query="SELECT * FROM student WHERE stname=?";
			PreparedStatement ps=con.prepareStatement(query);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter student name to fetch details : ");
			String name=sc.next();
			ps.setString(1, name);
			ResultSet rs=ps.executeQuery();
			rs.next();
			System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getInt(3)+" | "+rs.getString(4));
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
