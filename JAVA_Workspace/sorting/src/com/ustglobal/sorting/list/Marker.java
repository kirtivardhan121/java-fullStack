package com.ustglobal.sorting.list;

public class Marker implements Comparable<Marker> {

	int price;
	String color;
	
	public Marker(int price, String color) {
		super();
		this.price = price;
		this.color = color;
	}
	
	@Override
	public int compareTo(Marker m) {
		
		Integer i = this.price;
		Integer j = m.price;
		return i.compareTo(j);	
	}
}
