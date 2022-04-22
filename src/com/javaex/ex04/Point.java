package com.javaex.ex04;

public class Point {
	
	private int x;
	private int y;
	
	
	// setter 메소드
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	
	// getter 메소드
	public int getX() {
		return this.x; // 얘는 this 붙여도 되고 안붙여도 됨
	}
	
	public int getY() {
		return this.y;
	}
	
	
	//일반 메소드
	public void draw() {
		System.out.println("점[x=" + this.x + ", y=" + this.y + "]을 그렸습니다.");
	}

}
