package com.ustglobal.google;

public class TestA {

	public static void main(String[] args) {
		
		Browser b = new Browser();
		Gmail g = new Gmail();
		b.open(g);
		
		System.out.println("------------------------");
		
		GoogleDrive d = new GoogleDrive();
		b.open(d);
	}
}
