package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



  @WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String b = request.getParameter("email");
		String c = request.getParameter("pass");
		
		try {
			PrintWriter out = response.getWriter();
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/try","root","root");
			String qry = "Select * from db where mail = '"+b+"' and pass = '"+c+"' ";
			PreparedStatement ps = con.prepareStatement(qry);
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				out.print("<html><body><script>alert('Login Successful')</script></body></html>");
				RequestDispatcher r = request.getRequestDispatcher("index.html");
				r.include(request,response);
			} else {
				out.print("<html><body><script>alert('Login Unsuccessful')</script></body></html>");
				RequestDispatcher r = request.getRequestDispatcher("index.html");
				r.include(request,response);
			}			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
