package com.pojo;

public class User {
	private String email, password, name, address, username;
	private long contact;
	public String getEmail() {
		return email;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", name=" + name + ", address=" + address
				+ ", username=" + username + ", contact=" + contact + "]";
	}
	public User(String email, String password, String name, String address, String username, long contact) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.address = address;
		this.username = username;
		this.contact = contact;
	}

	
}
