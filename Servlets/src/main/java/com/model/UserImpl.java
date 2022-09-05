package com.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.MyConnection;
import com.pojo.User;

public class UserImpl {
	
	public boolean register(User user) {
		boolean b = false;
		String sql = "insert into user values(?,?,?,?,?,?,?,?)";
		try (Connection connection=MyConnection.connect()){	  
			PreparedStatement pstatement=connection.prepareStatement(sql); // sql must be passed here
			 
			pstatement.setString(1, user.getName());
			pstatement.setInt(2, user.getAge());
			pstatement.setLong(3, user.getContact());
			pstatement.setString(4, user.getEmail());
			pstatement.setString(5, user.getUname());
			pstatement.setString(6, user.getPassword());
			pstatement.setString(7, user.getGender());
			pstatement.setString(8, user.getLoc());
			
			System.out.println(pstatement);
			System.out.println(pstatement.getClass());
			
			  int no=pstatement.executeUpdate(); // do not pass sql here
			  System.out.println("Number of rows affected: "+no);
			  if(no>0)
				  b=true;
			  System.out.println("b"+b);
		} 
		  catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connection Autoclosed"+b);
		return b;
		}

	public String login(String uname, String password) {

		
		String name=null;
		
		try(Connection conn=MyConnection.connect()) {
			
			String sql = "select * from user where username=? and password=?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, uname);
			pstmt.setString(2, password);
			
			ResultSet rs= pstmt.executeQuery();
			System.out.println("rs"+rs);
			if(rs.next()) {
				System.out.println("if name");
				name=rs.getString("first_name");
			}
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return name;
	}
	
	public boolean passwordChange(User user, String newPassword) throws ClassNotFoundException {
		
		boolean b = false;
		
		try(Connection conn=MyConnection.connect()) {
			String sql = "update user set password=? where username=? and password=?";
			System.out.println(sql);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, newPassword);
			pstmt.setString(2, user.getUname());
			pstmt.setString(3, user.getPassword());
			System.out.println(pstmt);
			int no = pstmt.executeUpdate();
			System.out.println("Number of rows affected: "+no);
			  if(no>0)
				  b=true;
			  System.out.println("b"+b);
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return b;
	}
}
