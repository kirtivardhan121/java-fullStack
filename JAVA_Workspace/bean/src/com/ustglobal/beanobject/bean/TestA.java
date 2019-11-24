package com.ustglobal.beanobject.bean;

public class TestA {

	public static void main(String[] args) {
		Student s = new Student();
		s.setId(10);
		s.setName("Vardhan");
		s.setRollno(95);
		
		Database d = new Database();
		d.receive(s);
		
		Employee e = new Employee();
		e.setId(909);
		e.setName("KV");
		e.setSalary(1000000);
		
		
	}
}
