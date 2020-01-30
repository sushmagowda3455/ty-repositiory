package com.dbTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class InsertDataToDB {
	public static void main(String[] args) throws SQLException {
		// load the drivers
		Driver d = new Driver();
		
		// register driver of mysql
		DriverManager.registerDriver(d);
		
		//established connectionof db
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","admin");
		
		//create a query
		Statement stat= con.createStatement();
		String query = "insert into students_info(regno, firstname,middlename,lastname) values('2','sushma','KL','gowda')";
		//execute query & fetch data
		int res = stat.executeUpdate(query);
		if(res==1)
		{
			System.out.println("Data enter");       
			
		}
		else
		{
			System.out.println("failed");
		}
		
		//close the connection
		con.close();
		}
		
		

}
