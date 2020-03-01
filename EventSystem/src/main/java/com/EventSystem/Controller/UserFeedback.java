package com.EventSystem.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.EventSystem.Bean.FeedbackBean;
import com.EventSystem.Model.UserDB;

/**
 * Servlet implementation class UserFeedback
 */
public class UserFeedback extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	String s1;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserFeedback() {
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
		
		String n_name,n_email,n_message;
		n_name=request.getParameter("n_name");
		n_email=request.getParameter("n_email");
		n_message=request.getParameter("n_message");
			    
	   
		FeedbackBean fb = new FeedbackBean();
		
		
		fb.setN_name(n_name);
		fb.setN_email(n_email);
		fb.setN_message(n_message);
		
		
		UserDB udb = new UserDB();
		
		
		try {
			s1 = udb.UserFeedback(fb);
			out.println("<html>");
			out.println(" <head>");
			out.println("<meta http-equiv='refresh' content='1;url=http://localhost:8080/EventSystem/index.jsp' /");
			out.println("<head>");
			out.println("<body>");
			out.println("<h1>Thanks For your Feedback</h1>");
			out.println("</body>");
			out.println("</html>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s1);
				
	}

}
