package com.javaex.ex01;

public class Customer extends User{
	
	private int point;

	public Customer() {
		super();
	}

	public Customer(String id, String password, String name, int point) {
		super(id, password, name);
		this.point = point;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public String toString() {
		return "Customer [point=" + point + "]";
	}

	public void showInfo() {
		System.out.println("아이디:"+super.getId()+"\t비번:"+super.getPassword()+"\t이름:"+super.getName()+"\t포인트:"+point);
	}
}
