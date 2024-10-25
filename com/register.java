
		package com;

		import java.io.IOException;
		import java.io.PrintWriter;
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.PreparedStatement;
		import java.sql.SQLException;
		import javax.servlet.RequestDispatcher;
		import javax.servlet.ServletException;
		import javax.servlet.annotation.WebServlet;
		import javax.servlet.http.HttpServlet;
		import javax.servlet.http.HttpServletRequest;
		import javax.servlet.http.HttpServletResponse;

		@WebServlet("/Register")
		public class register extends HttpServlet {
			private static final long serialVersionUID = 1L;

			protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
				String a = request.getParameter("username");
				String b = request.getParameter("mail");
				String c = request.getParameter("pass");	
				
				try {
					PrintWriter out = response.getWriter();
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3303/try","root","root");
					String qry = "insert into db(username,mail,pass) values(?,?,?)";
					PreparedStatement ps = con.prepareStatement(qry);
					ps.setString(1,a);
					ps.setString(2,b);
					ps.setString(3,c);
					int rs = ps.executeUpdate();
					if (rs>0) {
						out.print("<html><body><script>alert('Registration Successful')</script></body></html>");
						RequestDispatcher r = request.getRequestDispatcher("index.html");
						r.include(request,response);
					} else {
						out.print("<html><body><script>alert('Registration Unsuccessful')</script></body></html>");
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


