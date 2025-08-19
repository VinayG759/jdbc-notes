package com.jsp.first;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
public class Register {
	public static void main(String[] args) {
		
			try {
				DriverManager.registerDriver(new Driver());
				System.out.println("Loading done");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//throws SQLException
			
		
		
	}
}
