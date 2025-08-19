package com.jsp.third;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DyanmicQuery {
	public static void main(String[] args) {
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/jdbc-third-database";
			String user="root";
			String password="vinayg1752004@gmail.com";
			 con=DriverManager.getConnection(url, user, password);
			Statement state=con.createStatement();
			String query="CREATE TABLE student (stid INT(2) PRIMARY KEY,stname VARCHAR(20) NOT NULL,stage INT(2) NOT NULL,email VARCHAR(50) UNIQUE)";
			state.execute(query);
			System.out.println("Table Created");
			String query1="INSERT INTO student VALUES(?,?,?,?)";
			PreparedStatement ps=con. prepareStatement(query1);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter student data");
			System.out.println("Enter student id : ");
			int id=sc.nextInt();
			System.out.println("Enter student name : ");
			String name=sc.next();
			System.out.println("Enter student Age : ");
			int age=sc.nextInt();
			System.out.println("Enter student email : ");
			String email=sc.next();
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setString(4, email);
			
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
