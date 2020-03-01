package com.EventSystem.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.EventSystem.Bean.UserManagementBean;

public class UserManagement {

	
	Connection conn = null;
    ResultSet rs = null;
	String s1;
	
	
	public String insertOwnerDetail(UserManagementBean umb) throws SQLException
	{
		MyDB db = new MyDB();
		
		Connection con = db.getConn();
		
		try
		{
		Statement stmt = con.createStatement();
			stmt.executeUpdate("insert into owner_detail (owner_name,owner_email,owner_phone,owner_gender,owner_address) values ('"+umb.getOwner_name()+"','"+umb.getOwner_email()+"','"+umb.getOwner_phone()+"','"+umb.getOwner_gender()+"','"+umb.getOwner_address()+"')");
			return "added";
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
