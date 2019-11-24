package com.ustglobal.hasarelation.weak;

public class TestB {

	public static void main(String[] args) {

		Car c = new Car();
		System.out.println(c.brand);
		System.out.println(c.model);
		c.drive();
		
		System.out.println("--------------------");
		
		c.m.play();
	}

}
