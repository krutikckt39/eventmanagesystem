package com.EventSystem.Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.EventSystem.Bean.FeedbackBean;
import com.EventSystem.Bean.RegisterBean;
public class UserDB {

	
	Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
	int i;
	String s1,s2;
	String login;
	
	
	public String insertUser(RegisterBean rb) throws SQLException
	{
		MyDB db = new MyDB();
		
		Connection con = db.getConn();
		
		try
		{
		Statement stmt = con.createStatement();
		String strQuery = "SELECT COUNT(*) FROM user where email='"+rb.getEmail()+"'";
		ResultSet rs = stmt.executeQuery(strQuery);
		rs.next();
		String Countrow = rs.getString(1);
		System.out.println(Countrow);
		if(Countrow.equals("0"))
		{
		  i = stmt.executeUpdate("insert into user (email,uname,passwd) values ('"+rb.getEmail()+"','"+rb.getUname()+"','"+rb.getPasswd()+"')");
		 return "absent";
		}
		else
		{
			return "present";
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public String loginData(RegisterBean rb) throws SQLException
	{
		
		MyDB db = new MyDB();
		ResultSet rs = null;
		Connection con = db.getConn();
		
		try
		{
			Statement stmt = con.createStatement();
			rs = stmt.executeQuery("select email, passwd from user where email = '"+rb.getEmail()+"' and passwd = '"+rb.getPasswd()+"'");
			
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
	
	public String UserFeedback(FeedbackBean fb) throws SQLException
	{
		
		MyDB db = new MyDB();
		Connection con = db.getConn();
		
		
		try
		{
		Statement stmt = con.createStatement();
		stmt.executeUpdate("insert into user_feedback (n_name,n_email,n_message) values ('"+fb.getN_name()+"','"+fb.getN_email()+"','"+fb.getN_message()+"')");
		s1 = "Feedback Send";
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return s1;
		
	}
	
}
