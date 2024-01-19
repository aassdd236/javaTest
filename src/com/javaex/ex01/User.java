package com.javaex.ex01;

public abstract class User {

	private String id;
	private String password;
	private String name;
	
	
	public User() {
		super();
	}

	public User(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", name=" + name + "]";
	}

	abstract void showInfo();
}
