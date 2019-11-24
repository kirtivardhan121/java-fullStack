package com.ustglobal.java8.predicate;

import java.util.function.Predicate;


public class TestA {

	public static void main(String[] args) {

		Predicate<Person> p1 = p -> {
			if(p.age >= 18 ) {
				return true;
			}else {
				return false;
			}
		};

		Person p = new Person("Vardhan", 20);

		boolean result = p1.test(p);
		System.out.println("Result is " +result);

	}
}