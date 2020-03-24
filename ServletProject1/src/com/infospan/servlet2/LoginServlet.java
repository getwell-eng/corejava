package com.infospan.servlet2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("uname");
		String password = request.getParameter("upsw");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html><body>");
		if (username.equals("nehal") && password.equals("nehal123")) {
			out.println("<p>Welcome to login </p>");

		} else {
			out.println("<p>invalid pswd or name</p>");
		}

		out.println("</body></html>");
	}

}
