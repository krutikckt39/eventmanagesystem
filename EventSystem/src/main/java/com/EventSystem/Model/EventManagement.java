package com.EventSystem.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.EventSystem.Bean.EventManagementBean;
import com.EventSystem.Bean.UserManagementBean;

public class EventManagement {

	int i;
	Connection conn = null;
    ResultSet rs = null;
	String s1;
	
	
	public String insertEventDetail(EventManagementBean emb, UserManagementBean umb) throws SQLException
	{
		MyDB db = new MyDB();
		
		Connection con = db.getConn();
		
		try
		{
			
		Statement stmt = con.createStatement();
		
		String strQuery = "SELECT COUNT(*) FROM event_detail where owner_email='"+umb.getOwner_email()+"' and e_type='"+emb.getE_type()+"' ";
		ResultSet rs = stmt.executeQuery(strQuery);
		rs.next();
		String Countrow = rs.getString(1);
		System.out.println(Countrow);
		
		if(Countrow.equals("0"))
		{
		  i = stmt.executeUpdate("insert into event_detail (e_type,hall_name,org_email,org_phone,hall_capacity,e_location,e_price,owner_name,owner_email) values ('"+emb.getE_type()+"','"+emb.getHall_name()+"','"+emb.getOrg_email()+"','"+emb.getOrg_phone()+"','"+emb.getHall_capacity()+"','"+emb.getE_location()+"','"+emb.getE_price()+"','"+umb.getOwner_name()+"','"+umb.getOwner_email()+"')");
		  return "added";
		}
		else
		{
			return "absent";
		}
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
