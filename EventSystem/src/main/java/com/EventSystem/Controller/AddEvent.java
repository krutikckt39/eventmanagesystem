package com.EventSystem.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.EventSystem.Bean.EventManagementBean;
import com.EventSystem.Bean.UserManagementBean;
import com.EventSystem.Model.EventManagement;
import com.EventSystem.Model.UserManagement;

/**
 * Servlet implementation class AddEvent
 */
public class AddEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	String s1, s2;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEvent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//Owner Detail 
		
		String owner_name,owner_email,owner_phone,owner_gender,owner_address;
		owner_name = request.getParameter("owner_name");
		owner_email = request.getParameter("owner_email");
		owner_phone = request.getParameter("owner_phone");
		owner_gender = request.getParameter("owner_gender");
		owner_address = request.getParameter("owner_address");	
		
		
		UserManagementBean umb = new UserManagementBean();
		
		umb.setOwner_name(owner_name);
		umb.setOwner_email(owner_email);
		umb.setOwner_phone(owner_phone);
		umb.setOwner_gender(owner_gender);
		umb.setOwner_address(owner_address);
		
		//Event Details
		
		String e_type,hall_name,org_email,org_phone,hall_capacity,e_price,e_location;
		
		e_type=request.getParameter("e_type");
		hall_name=request.getParameter("hall_name");
		org_email=request.getParameter("org_email");
		org_phone=request.getParameter("org_phone");
		hall_capacity=request.getParameter("hall_capacity");
		e_price=request.getParameter("e_price");
		e_location=request.getParameter("e_location");
		
		EventManagementBean emb = new EventManagementBean();
		
		emb.setE_type(e_type);
		emb.setHall_name(hall_name);
		emb.setOrg_email(org_email);
		emb.setOrg_phone(org_phone);
		emb.setHall_capacity(hall_capacity);
		emb.setE_location(e_location);
		emb.setE_price(e_price);
		
		
		//Data Code
		UserManagement um = new UserManagement();
		EventManagement em = new EventManagement();
		
		
		try
		{
			s1 = um.insertOwnerDetail(umb);
			s2 = em.insertEventDetail(emb,umb);
			
			if(s1.equalsIgnoreCase("added") && s2.equalsIgnoreCase("added"))
			{
				out.println("Owner and Event Added");
			}
			else
			{
				out.println("Owner and Event Not Added");
			}
			
			
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		System.out.println(s1+s2);
		
	}

}
