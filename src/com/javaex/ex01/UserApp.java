package com.javaex.ex01;

import java.util.ArrayList;

public class UserApp {

	public static void main(String[] args) {

		ArrayList<User> uList=new ArrayList<>();

		User u01=new Staff("master", "m7788", "운영자", 3500000);
		User u02=new Customer("jung-ws", "j1357913579", "정우성", 1000);
		User u03=new Customer("LeeHR", "a123!!", "이효리", 2500);
		User u04=new Customer("ms-park", "y2345", "박명수", 1200);


		uList.add(u01);
		uList.add(u02);
		uList.add(u03);
		uList.add(u04);

		System.out.println("---------------회원+운영자 전체리스트----------------------");
		for (int i = 0; i < uList.size(); i++) {
			System.out.print(i + 1+".");
			uList.get(i).showInfo();
		}
		
		System.out.println();
		for (int i = 0; i < uList.size(); i++) {
			if (uList.get(i) instanceof Staff) {
				int salary = ((Staff) uList.get(i)).getSalary();
				System.out.println(uList.get(i).getName()+"의 연봉은 " + salary*12+" 입니다.");
			}
		}
	}
}