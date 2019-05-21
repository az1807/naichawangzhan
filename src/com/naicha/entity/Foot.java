package com.naicha.entity;

public class Foot {
	//1
	private int id ;
	private String name;
	private String phone;
	private String email;
	private String address;
	private String cultrue;
	private String introductinon;
	//2
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCultrue() {
		return cultrue;
	}
	public void setCultrue(String cultrue) {
		this.cultrue = cultrue;
	}
	public String getIntroductinon() {
		return introductinon;
	}
	public void setIntroductinon(String introductinon) {
		this.introductinon = introductinon;
	}
	
	//3
	public Foot() {
	
	}
	public Foot(int id, String name, String phone, String address,
			String email, String cultrue, String introductinon) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.cultrue = cultrue;
		this.introductinon = introductinon;
	}
	//4
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", phone=" + phone
				+ ", address=" + address + ", email=" + email + ", cultrue="
				+ cultrue + ", introductinon=" + introductinon + "]";
	}
	
	
	
	

}
