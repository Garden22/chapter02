package com.javaex.ex03;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	
	//생성자
	
	
	//메소드 - gs
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		if (price < 0) {
			this.price = 0;
		} else {
			this.price = price;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	//메소드 - 일반
	public void showInfo() {
		System.out.println("상품이름: " + getName());
		System.out.println("가격 : " + getPrice());
		System.out.println();
	}

}
