package com.ustglobal.java8.predicate;

import java.util.function.Consumer;

import com.ustglobal.java8features.Student;

public class TestF {

	public static void main(String[] args) {
		
		Consumer<Student> c = s -> {
			System.out.println("Id is " +s.id);
			System.out.println("Name is " +s.name);
			System.out.println("Percentage is " +s.percentage);
			System.out.println("=============================");
		};
		
		Student s1 = new Student(01, "Vardhan", 67.9);
		c.accept(s1);
	}
}
