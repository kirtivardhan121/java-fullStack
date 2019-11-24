package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {

	public static void main(String[] args) {
		
		SortByNameCust sc = new SortByNameCust();
		TreeSet<Customer> ts = new TreeSet<Customer>(sc);
		
		Customer c1 = new Customer("Ram", 56, 678898668);
		Customer c2 = new Customer("Laxmana", 156, 678898668);
		Customer c3 = new Customer("Bharat", 256, 678898668);
		Customer c4 = new Customer("Satrughana", 66, 678898668);
		Customer c5 = new Customer("Ravana", 10, 678898668);
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		ts.add(c5);
		
		System.out.println("************ Using iterator ***********");
		
		Iterator<Customer> it = ts.iterator();
		while(it.hasNext()) {
			Customer c = it.next();
			System.out.println("Customer name " +c.name);
			System.out.println("Customer id " +c.id);
			System.out.println("Customer salary " +c.salary);
			
			System.out.println("====================================");
	}
}
}
