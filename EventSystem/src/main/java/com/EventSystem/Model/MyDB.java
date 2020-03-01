package com.EventSystem.Model;

import java.sql.*;



public class MyDB {

	public static void main(String[] args) throws SQLException
	{
		MyDB mdb = new MyDB();
		mdb.getConn();
	}
	
	Connection con = null;
	public Connection getConn() throws SQLException
	{
		
		try 
		{
			
			String url = "jdbc:mysql://localhost:3306/";
			String database = "eventsystem";
			String username = "root";
			String password = "root";
			
			Class.forName("com.mysql.jdbc.Driver");
		    Connection con = DriverManager.getConnection(url+database, username, password);
		    System.out.println("Connection Found");
			return con;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
	}

}
