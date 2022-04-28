package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {
		Shape s01 = new Shape("빨", "파");
		System.out.println(s01.toString());
		s01.draw();
		
		Triangle t01 = new Triangle("빨", "검", 1, 2);
		t01.draw();
	}
}