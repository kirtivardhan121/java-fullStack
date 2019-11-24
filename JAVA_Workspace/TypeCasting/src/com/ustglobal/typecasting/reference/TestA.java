package com.ustglobal.typecasting.reference;

public class TestA {

	public static void main(String[] args) {
		Pen p = new Marker();  //Up Casting
		System.out.println(p.cost);
		p.write();
//		System.out.println(p.size);  Not Possible
//		p.color();  NOt Possible
		Marker m = (Marker) p; //Down Casting
		System.out.println(m.size);
		m.color();
		m.write();
		
		
	}
}
