package com.pojo;

import java.util.List;

public class User {

	private String name, uname, password, loc, gender, email;
	private int age;
	private long contact;
	List<String> courseList;
	public String getName() {
		return name;
	}
	public User(String name, String uname, String password, String loc, String gender, int age, long contact,
			List<String> courseList) {
		super();
		this.name = name;
		this.uname = uname;
		this.password = password;
		this.loc = loc;
		this.gender = gender;
		this.age = age;
		this.contact = contact;
		this.courseList = courseList;
		this.email = email;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [email=" + email + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public List<String> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<String> courseList) {
		this.courseList = courseList;
	}
}
