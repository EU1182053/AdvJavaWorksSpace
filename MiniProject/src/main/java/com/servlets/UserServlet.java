package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.MyConnection;
import com.model.UserImpl;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void init(ServletConfig config) throws ServletException {
		try(Connection conn = MyConnection.connect()) {
			System.out.println("databse connected.");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String userAction=request.getParameter("act");
		System.out.println("useraction"+userAction);
		UserImpl impl=new UserImpl();
		
		if(userAction.equalsIgnoreCase("registerAction"))
		{
			
		}
		else if(userAction.equalsIgnoreCase("loginAction"))
		{
			
		}
		else if(userAction.equalsIgnoreCase(""))
		System.out.println("Request comes in post");
	}

}
