package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestH {

	public static void main(String[] args) {

		
		Vector v1 = new Vector();
		v1.add(12);
		v1.add(34.5);
		v1.add("Nisha");
		v1.add(true);
		v1.add(null);
		
		for (int i = 0 ; i< v1.size() ; i++) {

			System.out.println(v1.get(i));
		}
		
		System.out.println("=========== Using for each ===========");
		
		for(Object object : v1 ) {
			System.out.println(object);
		}
		
		System.out.println("========== Using Iterator ==============");
		
		Iterator it = v1.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
			
		}
		System.out.println("========== Using vector Iterator ==========");
		
//		LinkedListIterator it1 = v1.listIterator();
//		while(it1.hasNext()) {
//			Object o1 = it1.next();
//			System.out.println(o1);
//		}
	}

}
