package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {

	public static void main(String[] args) {
		
		LinkedHashSet<Double> ls = new LinkedHashSet<>();
		
		ls.add(33.5);
		ls.add(34.9);
		ls.add(10.8);
		ls.add(0.08);
		ls.add(33.5);
		ls.add(null);
		
		System.out.println("********** Using for each ***********");

		for(Double s : ls) {
			System.out.println(s);
		}
		
		System.out.println("********** Using Iterator ***********");

		Iterator<Double> it = ls.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
		}
	}
}
