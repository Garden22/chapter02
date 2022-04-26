package com.javaex.ex10;

public class GoodsApp {
	public static void main(String[] args) {
	
		Goods camera = new Goods("Nikon", 400000);
		System.out.println(camera.toString());

		Goods computer = new Goods("LG Gram", 900000);
		System.out.println(computer.toString());

		Goods cup = new Goods("Mug", 2000);
		System.out.println(cup.toString());

		System.out.println(Goods.count);
		
	}
}
