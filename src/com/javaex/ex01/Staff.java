package com.javaex.ex01;

public class Staff extends User {
	private int salary;

	public Staff() {
		super();
	}

	public Staff(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "\n"+super.getName()+"의 연봉은 "+salary*12+" 입니다.";
	}

	public void showInfo() {
		System.out.println("아이디:"+super.getId()+"\t비번:"+super.getPassword()+"\t이름:"+super.getName()+"\t월급:"+salary);

	}
}
