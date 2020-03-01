package com.EventSystem.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.EventSystem.Bean.AddEventBean;
import com.EventSystem.Bean.RegisterBean;

public class AdminDB {

	String s1;
	String s2;
	Connection conn = null;
	
	public String adminLogin(RegisterBean rb) throws SQLException
	{
		
		MyDB db = new MyDB();
		ResultSet rs = null;
		Connection con = db.getConn();
		
		try
		{
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery("select adname, adpassword from admin_data where adname = '"+rb.getAdname()+"' and adpassword = '"+rb.getAdpassword()+"'");
			
			if(rs.next())
			{
				return "login";
			}
			else 
			{
				return "wrong";
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return null;
		
	}
	
	public String owner_info(AddEventBean aeb) throws SQLException
	{
		MyDB db = new MyDB();
		
		Connection con = db.getConn();
		
		try
		{
		Statement stmt = con.createStatement();
		
		stmt.executeUpdate("insert into owner_info (owner_name,owner_email,owner_phone) values ('"+aeb.getOwner_name()+"','"+aeb.getOwner_email()+"','"+aeb.getOwner_phone()+"')");
		s1 = "Owner Data Inserted";
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return s1;
	}

}
