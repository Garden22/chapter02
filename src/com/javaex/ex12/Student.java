package com.javaex.ex12;

public class Student extends Person { //항상 부모부터 불러옴. 부모는 super 나는 this(부모 입장에선 sub)
	//필드 
	private String schoolName; // >> private하면 부모자식간에도 못불러옴

	
	//생성자 >> 부모 생성자가 먼저 불러와짐
	public Student() {
		super();
	}
	
	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
	}
	
	
	//메소드 gs
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	//메소드 >>> 재정의(부모랑 같은 이름으로)
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + ", name=" + name + ", age=" + age + "]";
	}
	
	public void showInfo() { // 오버라이드 안하고 싶으면 super.showInfo() 하면 됨
		System.out.println("이름: " + name + ", 나이: " + age + ", 학교: " + schoolName);
	}
		
	
}
