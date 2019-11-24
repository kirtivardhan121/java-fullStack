package com.ustglobal.lambdaexpression;

public class MsgTest {

	public static void main(String[] args) {

		MsgInterface msg = (message) -> {
			System.out.println("hello");
			System.out.println(message);
			return message;
		};
		String message  = msg.greet("Hello");
		System.out.println(message);
		
	}

}
