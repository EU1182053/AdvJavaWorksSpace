package com.pojo;

public class User {
	private String email, password;

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}

	public String getEmail() {
		return email;
	}

	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
