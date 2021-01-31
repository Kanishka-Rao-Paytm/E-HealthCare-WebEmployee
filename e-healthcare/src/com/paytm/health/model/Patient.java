package com.paytm.health.model;

public class Patient {

	private String id;
	private String fullname;
	private String phone;
	private String email;
	private String jobrole = "Patient";
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJobrole() {
		return jobrole;
	}
	public void setJobrole() {
		this.jobrole = "Patient";
	}
	
	
}
