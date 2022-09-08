package com.model;

public interface UserDao {
	
	public boolean register();
	public boolean login();
	public boolean changePassword();
	public boolean updateProfile();
	public String getUserByUsername();
	public boolean deleteUserByUsername();
	
	
}
