package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestE {

	public static void main(String[] args) {

		LinkedList<Pen> l = new LinkedList<Pen>();

		Pen p1 = new Pen(20.5, "Reynolds");
		Pen p2 = new Pen(10.5, "Parker");
		Pen p3 = new Pen(7.5,  "Gel");
		Pen p4 = new Pen(50.9, "Marker");

		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);


		System.out.println("Before Sorting");
		displayPendetails(l);
		Collections.sort(l);
		System.out.println("<-------------After Sorting ---------------->");
		displayPendetails(l);

	}

		static void displayPendetails (LinkedList<Pen> l) {
		Iterator<Pen> it = l.iterator();
			while(it.hasNext()) {
			Pen lp = it.next();
			System.out.println("Price is " +lp.price);
			System.out.println("Brand is " +lp.brand);
		}

	}
}
