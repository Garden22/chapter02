package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		
		//섞어쓰기 > 자식의 메소드는 사용할 수 없음
		Circle c01 = new Circle("빨", "파", 1);
		Circle c02 = new Circle("검", "초", 3);
		
		Triangle t01 = new Triangle("빨", "검", 1, 2);
		Triangle t02 = new Triangle("빨", "흰", 4, 2);
		
		Rectangle r01 = new Rectangle("흰", "흰", 1, 1);
		Rectangle r02 = new Rectangle("보", "흰", 5, 2);

		Shape[] sArray = new Shape[6];
		sArray[0] = c01;
		sArray[1] = t01;
		sArray[2] = r01;
		sArray[3] = c02;
		sArray[4] = t02;
		sArray[5] = r02;
		
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
				
		Drawable p01 = new Point(1, 1);
		p01.draw();
		
		Point p02 = new Point(2, 2);
		p02.draw();
		
		Drawable[] dArray = new Drawable[8];
		dArray[0] = c01;
		dArray[1] = c02;
		dArray[2] = t01;
		dArray[3] = t02;
		dArray[4] = r01;
		dArray[5] = r02;
		dArray[6] = p01;
		dArray[7] = p02;
		
		for (int i = 0; i < dArray.length; i++) {
			dArray[i].draw();
		}
	}
}