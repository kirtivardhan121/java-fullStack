package com.ustglobal.wrapperclasses;

public class TestA {
	public static void main(String[] args) {
	
	int a = 10;
	System.out.println("a is " +a);
	Integer i = a;  // Boxing or Auto Boxing
	System.out.println("I is " +i);
	
	Integer x = 10;
	Integer z = new Integer(20);
	System.out.println("x is " +x);
	
	int y = x;  // unBoxing auto unBoxing
	System.out.println("y is " +y);
	
	int value = Integer.parseInt("123");  //Parsing
	System.out.println("Value is " +value);
	
	
	int value1 = Integer.parseInt("123String"); //Number Format Exception
	System.out.println("value 1 is " +value1);
	
	
	boolean result = Boolean.parseBoolean("true");
	System.out.println("Result is " +result);
}
}
