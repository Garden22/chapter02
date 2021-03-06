package com.javaex.ex06;

public class Goods {
	//필드
	private String name;
	private int price;
	
	
	
	//생성자 >> 얘는 public 뒤에 빈칸으로 // 로직을 추가하함. 클래스를 메모리에 인스턴스로 올림
	public Goods() { //기본 생성자
		System.out.println("Goods()");
	}
	
	public Goods(String name) {
		this.name = name;
		System.out.println("Goods(1)");
	}
	
	public Goods(String name, int price) { //생성자는 여러개 생성해도 됨/ 추가로직
		this.name = name;
		this.price = price;
		System.out.println("Goods(2)");
	}
	// 이름이 똑같지만 받는 파라미터가 다른 애들을 '생성자 오버로딩'이라고 함
	
	
	
	//메소드 gs
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	
	
	//메소드
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	/*public void showInfo() {
		System.out.println("*상품이름: " + getName());
		System.out.println("*가격 : " + getPrice());
		System.out.println();
	}*/

}
