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
 * Servlet implementation class userLogin
 */
public class userLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	String s1, s2;
    public userLogin() {
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
		String email, passwd;
		email=request.getParameter("email");
		passwd=request.getParameter("passwd");
		
		RegisterBean rb = new RegisterBean();
		
		rb.setEmail(email);
		rb.setPasswd(passwd);
		
		
		UserDB udb = new UserDB();
		
		try {
			String s1 = udb.loginData(rb);
			
			if(s1.equalsIgnoreCase("login"))
			{
				
				out.println("<html>");
				out.println(" <head>");
				out.println("<meta http-equiv='refresh' content='2;url=http://localhost:8080/EventSystem/jsp/BookingForm.jsp' /");
				out.println("<head>");
				out.println("<body>");
				out.println("<center>");
				out.println("<h1>Login Successfull</h1>");
				out.println("<h3>welcome "+email+"</h3>");
				out.println("<h2>Redirect in 2 sec....</h2>");
				out.println("</center>");
				out.println("</body>");
				out.println("</html>");
				
				
				
			}
			else if(s1.equalsIgnoreCase("wrong"))
			{
				out.println("<html>");
				out.println(" <head>");
				out.println("<meta http-equiv='refresh' content='2;url=http://localhost:8080/EventSystem/jsp/UserLogin.jsp' /");
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
	 * @return 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
