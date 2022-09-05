package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.UserImpl;
import com.pojo.User;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Request comes in get");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String userAction=request.getParameter("act");
		System.out.println("useraction"+userAction);
		UserImpl impl=new UserImpl();
		System.out.println("Request comes in post");	
		
		if(userAction.equalsIgnoreCase("registerAction"))
		{
			String name=request.getParameter("first_name");	
			int age=Integer.parseInt(request.getParameter("age"));
			long contact=Long.parseLong(request.getParameter("contact"));
			String emailId=request.getParameter("emailid");
			String username=request.getParameter("uname");
			String password=request.getParameter("pass");
			String gender=request.getParameter("gender");
			String location=request.getParameter("loc");
			String interestedCourses[]=request.getParameterValues("course");
		 	List<String> courseList=  Arrays.asList(interestedCourses);
			
			User user=new User();
			user.setAge(age); user.setContact(contact);
			user.setCourseList(courseList);
			user.setEmail(emailId);user.setGender(gender);
			user.setLoc(location);user.setName(name);
			user.setPassword(password); user.setUname(username);	
			System.out.println(user);
			
			boolean b=impl.register(user);
			if(b)
				pw.print("You are registered successfully.......");
			else
				pw.print("Something went wrong.....");
		}// registerAction
		else if(userAction.equalsIgnoreCase("loginAction")) {
			// do the controlling logic for login
			
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			
			String name=impl.login(username,password);
			if(name!=null)
//				pw.print("You are logged in successfully....... Welcome "+name);
				response.sendRedirect("Success.html");
			else
//				pw.print("Something went wrong.....");
				response.sendRedirect("Error.html");
			
		}
		else if(userAction.equalsIgnoreCase("changeAction")) {
			String username=request.getParameter("uname");
			String password=request.getParameter("pass");
			String newPass = request.getParameter("newPass");
			
			User user=new User();
			
			user.setUname(username);
			user.setPassword(password);
			
			boolean b = false;
			try {
				b = impl.passwordChange(user,newPass);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(b)
				pw.print("Password Changed successfully.......");
			else
				pw.print("Something went wrong.....");
			
		}
	}

}