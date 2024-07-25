package com.jdbc_Employee_Management_System;



	import java.sql.*;
	public class DatabaseConn {

	    Connection c;
	    Statement s; // Step 3 Creating statement class

	    public DatabaseConn() {

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver"); // for connect mysql with JDBC

	            c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "Tiger"); // For the connection path
	           
	            s = c.createStatement();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
