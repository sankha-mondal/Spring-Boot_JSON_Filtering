package com.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class JsonFilter {
	
	private String name;
	@JsonIgnore
	private String password;
	private String location;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	@Override
	public String toString() {
		return "JsonFilter [name=" + name + ", password=" + password + ", location=" + location + "]";
	}
	
	public JsonFilter(String name, String password, String location) {
		super();
		this.name = name;
		this.password = password;
		this.location = location;
	}
	
	public JsonFilter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
