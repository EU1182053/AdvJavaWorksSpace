package com.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public MyServlet() {
        System.out.println("In Constructor.");
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	System.out.println("Servlet init phase.. do the settings that u want to do once");
    	System.out.println("bcz init called only once : on user's 1st request, first");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet Service Phase. it will be called on http GET request");
		System.out.println("it is called on every user get request");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Servlet Service Phase. it will be called on http POST request");
		System.out.println("it is called on every user post request");
	}
	
	@Override
	public void destroy() {
		System.out.println("Servlet destroy phase... release the resource that u want to release in the end phase of servlet ");
		System.out.println("it is called once, last");
	}

}
