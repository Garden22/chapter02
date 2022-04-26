package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {
		
		Person p01 = new Person("황일영", 22);
		p01.showInfo();
		
		Student s01 = new Student();
		s01.setAge(18);
		s01.setName("김서울");
		s01.setSchoolName("서울고등학교");
		System.out.println(s01.toString());	
		
		Student s02 = new Student("박서울", 19, "서울고등학교");
		System.out.println(s02.toString());
	}

}

