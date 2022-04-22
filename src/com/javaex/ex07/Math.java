package com.javaex.ex07;

public class Math {
	//필드
	
	//생성자
	public Math() {
		
	}
	
	//메소드 gs
	
	
	//메소드 일반
	public void plus(int a, int b) { //메소드 오버로드(파라미터가 달라서 돌아감)
		System.out.println(a + b);
	}
	
	public void plus(double a, int b) {
		System.out.println(a + b);
	}
	
	public void plus(int a, double b) {
		System.out.println(a + b);
	}
	
	public void plus(double a, double b) {
		System.out.println(a + b);
	}
}
