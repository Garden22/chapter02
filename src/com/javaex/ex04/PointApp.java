package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {

		Point p1 = new Point();
		p1.setX(5);
		p1.setY(5);
		p1.draw(true);
		
		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);
		p2.draw(true);
		
		Point p3 = new Point(10,20);
		p3.draw(true);
		
		Point p4 = new Point('x', 100);
		p4.setY(200);
		p4.draw(true);
		
		Point p5 = new Point('y', 500);
		p5.setX(1000);
		p5.draw(true);
		p5.draw(false);
	}

}
