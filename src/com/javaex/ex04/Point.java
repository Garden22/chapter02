package com.javaex.ex04;

public class Point {
	
	private int point_x;
	private int point_y;
	
	
	// setter 메소드
	public void setX(int x) {
		point_x = x;
	}
	
	public void setY(int y) {
		point_y = y;
	}
	
	
	// getter 메소드
	public int getX(int x) {
		return point_x;
	}
	
	public int getY(int y) {
		return point_y;
	}
	
	
	//일반 메소드
	public void draw() {
		System.out.println("점[x=" + point_x + ", y=" + point_y + "]을 그렸습니다.");
	}

}
