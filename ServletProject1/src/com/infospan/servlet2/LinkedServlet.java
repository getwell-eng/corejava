package com.infospan.servlet2;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class LinkedServlet
 */
@WebServlet("/LinkedServlet")
public class LinkedServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       


	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
           System.out.println("LinkedServlet.service() method is invoked...........");
	}

}
