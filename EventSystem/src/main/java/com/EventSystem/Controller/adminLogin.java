package com.EventSystem.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.EventSystem.Bean.RegisterBean;
import com.EventSystem.Model.AdminDB;

/**
 * Servlet implementation class adminLogin
 */
public class adminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public adminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		String adname, adpassword;
		adname=request.getParameter("adname");
		adpassword=request.getParameter("adpassword");
		
		RegisterBean rb = new RegisterBean();
		
		rb.setAdname(adname);
		rb.setAdpassword(adpassword);
		
		
		AdminDB adb = new AdminDB();
		
		try {
			String s1 = adb.adminLogin(rb);
			
			if(s1.equalsIgnoreCase("login"))
			{
				out.println("<html>");
				out.println(" <head>");
				out.println("<meta http-equiv='refresh' content='2;url=http://localhost:8080/EventSystem/jsp/AdminDashboard.jsp' /");
				out.println("<head>");
				out.println("<body>");
				out.println("<center>");
				out.println("<h1>Login Successfull</h1>");
				out.println("<h3>welcome "+adname+"</h3>");
				out.println("<h2>Redirect in 2 sec....</h2>");
				out.println("</center>");
				out.println("</body>");
				out.println("</html>");
			}
			else if(s1.equalsIgnoreCase("wrong"))
			{
				out.println("<html>");
				out.println(" <head>");
				out.println("<meta http-equiv='refresh' content='2;url=http://localhost:8080/EventSystem/jsp/AdminLogin.jsp' /");
				out.println("<head>");
				out.println("<body>");
				out.println("<center>");
				out.println("<h1>Something is Wrong</h1>");
				out.println("<h3>Email or Password Incorret</h3>");
				out.println("<h2>Redirect in 2 sec....</h2>");
				out.println("</center>");
				out.println("</body>");
				out.println("</html>");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
