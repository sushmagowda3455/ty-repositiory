package com.dbTest;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;



public class FetchDataFromDB {

	public static void main(String[] args) throws SQLException {
		// load the drivers
		Driver d = new Driver();
		
		// register driver of mysql
		DriverManager.registerDriver(d);
		
		//established connectionof db
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","admin");
		
		//create a query
		Statement stat= con.createStatement();
		String query = "select*from students_info";
		//execute query & fetch data
		ResultSet res = stat.executeQuery(query);
		while(res.next()){
			System.out.println(res.getInt(1) + "\t" + res.getString(2) + "\t" + res.getString(3) + "\t" + res.getString(4));
		}
		//close the connection
		con.close();
		}
		
		

	}


