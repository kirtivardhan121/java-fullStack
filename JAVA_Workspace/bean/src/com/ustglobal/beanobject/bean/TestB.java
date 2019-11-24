package com.ustglobal.beanobject.bean;

public class TestB {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setId(101);
		e.setName("vardhan");
		e.setSalary(100000000);
		e.setDept("Developer");
		e.setDesignation("Senior Developer");
		
		EmpDatabase a = new EmpDatabase();
		a.receive(e);
	}

}
