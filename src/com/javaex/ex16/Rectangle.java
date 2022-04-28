package com.javaex.ex16;

public class Rectangle extends Shape {
	//필드
	public int width;
	public int height;
	
	//상성자
	public Rectangle() {
		super();
	}
	
	public Rectangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}


	//gs메소드
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
		
	
	//메소드
	
	public void draw() {
	    System.out.println("[면색:" + fillColor + ", 선색:" + lineColor + ", 가로:" + width + ", 세로:" + height + "] 사각형을 그렸습니다. " );
	}
	
	public double area() {
		return width * height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
				+ lineColor + "]";
	}
	

}
