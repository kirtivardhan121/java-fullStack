package com.ustglobal.arrays;

public class TestB {

	public static void main(String[] args) {

		int[] num = {10,20,30,40,50};

		for(int i : num) {
			System.out.println(i);
		}
		
		System.out.println("===========================");
		
		char[] ch = {'a', 'b', 'c', 'd'};
		for(int j = 0 ; j<ch.length ; j++) {
			System.out.println(ch[j]);
		}
			System.out.println("==========================");
			
			for(int c : ch) {
				System.out.println(c);
			}
			System.out.println("===========================");
		
		byte[] b = {4,5,6,7,8};

		for(byte a : b) {
			System.out.println(a);
		}
		
		System.out.println("===============================");
		
		double[] d = {10.1,10.2,10.3,10.4};
		for(int x = 0 ; x<d.length ; x++) {
			System.out.println(d[x]);
		}
		
		System.out.println("===============================");
		
		String[] name = {"Kirti" , "Raj" , "Nishu"};
		for(String str1 : name) {
			System.out.println(str1);
		}
	}
}
