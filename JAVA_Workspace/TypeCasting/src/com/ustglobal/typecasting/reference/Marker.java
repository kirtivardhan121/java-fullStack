package com.ustglobal.typecasting.reference;

public class Marker extends Pen {

	double size;
	void color() {
		System.out.println("Marker Method");
	}
	
	@Override
	void write() {
		System.out.println("Marker Write Method");
	}
}
