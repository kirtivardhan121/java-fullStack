package com.ustglobal.exception.first;

public class TestD {

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		int[] a = {10,20,50,60};
		int b = 10;

		try {
			System.out.println(a[3]);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Index is not Present");
		}
		
		try {
			System.out.println(b/0);
		}catch (ArithmeticException ae) {
			System.out.println("Number is dividd by Zero");
		}
		
		System.out.println("Main Ended");
	}
}
