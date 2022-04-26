package com.javaex.ex11;

public class Math {
	//필드
	private static final double PI = 3.14;
	//생성자
	
	//메소드 gs
	
	//메소드 일반
	public static int plus(int a, int b) {
		return a + b;
	}
	
	public static double plus(double a, int b) {
		return a + b;
	}
	
	public static double plus(int a, double b) {
		return a + b;
	}
	
	public static double plus(double a, double b) {
		return a + b;
	}
	
	public static double circleArea(int r) {
		return PI * r * r;
	}
}
