package com.ustglobal.sorting.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TestM {

	public static void main(String[] args) {

		Comparator<EmployeeA> comp = (e1, e2) -> {
			return e1.name.compareTo(e2.name);
		};
		
		TreeSet<EmployeeA> ts = new TreeSet<EmployeeA>(comp);

		EmployeeA e1 = new EmployeeA(4, "Kirti", 5.5);
		EmployeeA e2 = new EmployeeA(2, "Raj", 5.7);
		EmployeeA e3 = new EmployeeA(3, "Harsh", 5.9);
		EmployeeA e4 = new EmployeeA(5, "Yash", 6.0);

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		System.out.println("********* Using Iterator **************");

		Iterator<EmployeeA> it = ts.iterator();
		while(it.hasNext()) {
			EmployeeA e = it.next();
			System.out.println("Name is " +e.name);
			System.out.println("Id " +e.id);
			System.out.println("Height is " +e.height);

			System.out.println("====================================");
		}

	}



}

