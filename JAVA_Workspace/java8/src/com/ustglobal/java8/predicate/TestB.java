package com.ustglobal.java8.predicate;

import java.util.function.Function;

public class TestB {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i -> i * i; //use function instead of Predicate if return type is boolean
		
		int res = f.apply(5);
		System.out.println("Square of 5 is " +res);
		
		int rsult = f.apply(4);
		System.out.println("Square of 4 is " +rsult);
		
	}
}
