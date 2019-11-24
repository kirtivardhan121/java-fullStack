package com.ustglobal.lambdaexpression;

public class SquareTest {

	public static void main(String[] args) {

		SquareInterface sq = x -> x * x;
		int value = sq.square(4);
		System.out.println("Square is = " +value);
	}

}
