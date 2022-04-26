package com.javaex.ex09;

public class GoodsApp {
	public static void main(String[] args) {
	
		Goods camera = new Goods("Nikon", 400000);
		Goods computer = new Goods("LG Gram", 900000);
		Goods cup = new Goods("Mug", 2000);
		
		Goods[] goodsArray = new Goods[3];
		goodsArray[0] = camera;
		goodsArray[1] = computer;
		goodsArray[2] = cup;
		
		for (int i = 0; i < 3; i++) {
			System.out.println(goodsArray[i].getName());
			System.out.println(goodsArray[i].getPrice());
		}
		
		System.out.println(goodsArray[1].toString());

	}
}
