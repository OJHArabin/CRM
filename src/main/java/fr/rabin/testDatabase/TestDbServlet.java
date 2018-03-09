package fr.rabin.testDatabase;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDbServlet
 */
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String user="springstudent";
		String pass ="springstudent";
		
		
		String jdbcurl =  "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		
		String driver = "com.mysql.jdbc.Driver";
		
		try {
			PrintWriter out = response.getWriter();
			
			out.println("Connecting to database:" + jdbcurl);
			
			Class.forName(driver);
			
			Connection myConn = DriverManager.getConnection(jdbcurl,user,pass);
			
			out.println("success");
			
			myConn.close();
		}
		catch(Exception exc) {
			exc.printStackTrace();
			throw new ServletException(exc);
			
		}
	}

}
