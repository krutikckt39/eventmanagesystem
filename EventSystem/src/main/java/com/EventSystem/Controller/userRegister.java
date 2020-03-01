package com.EventSystem.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.EventSystem.Bean.RegisterBean;

import com.EventSystem.Model.UserDB;

/**
 * Servlet implementation class userRegister
 */
public class userRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String s1;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userRegister() {
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
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
        String email,uname,passwd;
		email=request.getParameter("email");
		uname=request.getParameter("uname");
		passwd=request.getParameter("passwd");
			    
	   
		RegisterBean rb = new RegisterBean();
		
		rb.setEmail(email);
		rb.setUname(uname);
		rb.setPasswd(passwd);
		
		
		UserDB udb = new UserDB();
		
		
		try {
			s1 = udb.insertUser(rb);
			if(s1.equalsIgnoreCase("absent"))
			{
				
				out.println("<html>");
				out.println(" <head>");
				out.println("<meta http-equiv='refresh' content='2;url=http://localhost:8080/EventSystem/jsp/UserLogin.jsp' /");
				out.println("<head>");
				out.println("<body>");
				out.println("<center>");
				out.println("<h1>User Added</h1>");
				out.println("<h3>Thanks for Register "+email+"</h3>");
				out.println("<h2>Redirect in 2 sec....</h2>");
				out.println("</center>");
				out.println("</body>");
				out.println("</html>");
				
				
				
			}
			else if(s1.equalsIgnoreCase("present"))
			{
				out.println("<html>");
				out.println(" <head>");
				out.println("<meta http-equiv='refresh' content='2;url=http://localhost:8080/EventSystem/jsp/UserLogin.jsp' /");
				out.println("<head>");
				out.println("<body>");
				out.println("<center>");
				out.println("<h1>User Already Present</h1>");
				out.println("<h3>Go For Login</h3>");
				out.println("<h2>Redirect in 2 sec....</h2>");
				out.println("</center>");
				out.println("</body>");
				out.println("</html>");
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s1);
	}
}
