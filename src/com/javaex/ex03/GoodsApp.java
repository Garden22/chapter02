package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		camera.setName("Nikon");
		camera.setPrice(400000);
		
		Goods computer = new Goods();
		computer.setName("LG Gram");
		computer.setPrice(900000);
		
		Goods cup = new Goods();
		cup.setName("Mugcup");
		cup.setPrice(2000);
				
		
		System.out.println(camera.getName() + " : " + camera.getPrice() + " 원");
		System.out.println(computer.getName() + " : " + computer.getPrice() + " 원");
		System.out.println(cup.getName() + " : " + cup.getPrice() + " 원");
		
		System.out.println("======================================================");
		camera.showInfo();
		computer.showInfo();
		cup.showInfo();
	}

}
