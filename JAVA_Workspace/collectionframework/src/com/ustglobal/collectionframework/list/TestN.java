package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestN {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Kirti");
		al.add("Vardhan");
		al.add("Raj");
		al.add("Rohit");
		al.add("Singh");
		
		System.out.println("Before sort --------> " +al);
		Collections.sort(al);
		System.out.println("After sort ---------> " +al);
		
	}
}
