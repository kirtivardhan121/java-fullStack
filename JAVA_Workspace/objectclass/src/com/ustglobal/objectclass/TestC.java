package com.ustglobal.objectclass;

public class TestC {

	public static void main(String[] args) {
		
		ToString t = new ToString();
		int h = t.hashCode();
		String s = t.toString();
		System.out.println(h);
		System.out.println(s);
		
	}
}
