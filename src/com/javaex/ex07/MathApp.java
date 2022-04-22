package com.javaex.ex07;

public class MathApp {

	public static void main(String[] args) {
		
		Math calculator = new Math();
		calculator.plus(3, 5);
		calculator.plus(3.2, 5);
		calculator.plus(3, 5.2);
		calculator.plus(3.2, 5.2);

	}

}
