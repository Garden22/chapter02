package com.javaex.ex16;

public class ShapeApp {

	public static void main(String[] args) {

		//섞어쓰기 > 자식의 메소드는 사용할 수 없음
		Shape c01 = new Circle("빨", "파", 1);
		Shape c02 = new Circle("검", "초", 3);
		
		Shape t01 = new Triangle("빨", "검", 1, 2);
		Shape t02 = new Triangle("빨", "흰", 4, 2);
		
		Shape r01 = new Rectangle("흰", "흰", 1, 1);
		Shape r02 = new Rectangle("보", "흰", 5, 2);

		Shape[] sArray = new Shape[6];
		sArray[0] = c01;
		sArray[1] = t01;
		sArray[2] = r01;
		sArray[3] = c02;
		sArray[4] = t02;
		sArray[5] = r02;
		
		for (int i = 0; i < sArray.length; i++) {
			sArray[i].draw();
			System.out.println(sArray[i].area());
		}
		
	}
}