package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH {
	

	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<>();
		ht.put(100, "Ajay");
		ht.put(300, "Vijay");
		ht.put(2, "Sonu");
		ht.put(4, "Monu");
		ht.put(500, "Sriram");
		//		ht.put(null, "John"); //we can not add null for either key or value
		//		ht.put(8, null); //NullPointerException

		System.out.println("Data " +ht);
	}
}
