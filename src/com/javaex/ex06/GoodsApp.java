package com.javaex.ex06;

public class GoodsApp {

	public static void main(String[] args) {
		
		// 생성자가 없다면 아래처럼	
		/*Goods computer = new Goods();
		computer.setName("LG Gram");
		computer.setPrice(900000);*/
		
		Goods camera = new Goods("Nikon");
		camera.setPrice(400000);
		
		Goods cup = new Goods();
		cup.setName("Mug");
		cup.setPrice(2000);
		
		//Goods camera = new Goods("Nikon", 400000);
		Goods computer = new Goods("LG Gram", 900000);
		//Goods cup = new Goods("Mug", 2000);

		
		//System.out.println(computer.getName());
		System.out.println(computer.toString());
		System.out.println(camera.toString());
		System.out.println(cup.toString());
	}
}
