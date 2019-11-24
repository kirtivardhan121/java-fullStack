package com.ustglobal.objectclass;

public class TestE {

	public static void main(String[] args) {
		
		Car c = new Car(5000000, "BMW", "Black");
		System.out.println(c.hashCode());
		System.out.println(c.toString());

	}

}
