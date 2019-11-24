package com.ustglobal.hasarelation.weak;

public class TeatA {

	public static void main(String[] args) {
		
		Person p = new Person();
		System.out.println(p.name);
		
		p.sleep();
		p.eat();
		
		System.out.println("----------------------");
		
		p.m.write(); //Has-a-relation
		
	}
}
