package com.ustglobal.beanobject.bean;
import java.util.Scanner;

public class TestC {
	
	public static void main(String[] args) {
		System.out.println("Scanner classes");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Age is" +age);
		
		System.out.println("Enter First Name");
		String name = sc.next();
		System.out.println("First Name is " +name);
		
		System.out.println("Enter Last Name");
		String lname = sc.next();
		System.out.println("Last Name is " +lname);
		
		System.out.println("Are You male?");
		boolean a = sc.nextBoolean();
		System.out.println(a);
	}
}
