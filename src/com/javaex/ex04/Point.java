package com.javaex.ex04;

public class Point {
	//필드
	private int x;
	private int y;
	
	
	//생성자 >> 특별하게 받아야 할 애 생기기 전에는 디폴트 생성자랑 파라미터 풀로 받는 애만 만듦.
	public Point() {

	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
	}
	
	public Point(char xy, int dot) { //순서가 다른건 인식하는데, type이랑 순서 다 같으면 중복 메소드라고 생각(변수명은 기억 못함)
		if (xy == 'x') {
			this.x = dot;
			
		} else {
			this.y = dot;
		}
	}
	
	
	
	// getter setter 메소드 >> 보통 getter setter 다 받아줌...
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return this.x; // 얘는 this 붙여도 되고 안붙여도 됨
	}
	
	public int getY() {
		return this.y;
	}
	
	
	
	//일반 메소드
	public void draw(boolean action) {  //메소드 오버로딩
		if (action == true) {
			System.out.println("점[x=" + this.x + ", y=" + this.y + "]을 그렸습니다.");
		} else {
			System.out.println("점[x=" + this.x + ", y=" + this.y + "]을 지웠습니다.");
		}
	}


}
