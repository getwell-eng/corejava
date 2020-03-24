package com.infospan.app1;


import javax.servlet.*;

import javax.servlet.annotation.WebServlet;

import java.io.*;

@WebServlet("/OperandServlet")
public class OperandServlet extends GenericServlet  {
	private static final long serialVersionUID = 1L;

	public void service(ServletRequest req, ServletResponse res)  {

		try {
		String op1 = req.getParameter("op1");
		String op2 = req.getParameter("op2");

		int n1 = Integer.parseInt(op1);
		int n2 = Integer.parseInt(op2);

		int sum = n1 + n2;

		int sub = n1 - n2;

		int mul = n1 * n2;

		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		out.println("<html><body>");
		out.println("<p> Sum is: " + sum + " </p>");
		out.println("<p>Sub is: " + sub + "</p>");
		out.println("<p>Mul is: " + mul + "</p>");

		out.println("</body></html>");

		out.close();
		}catch(IOException ie){
			ie.printStackTrace();
		}
	}

}