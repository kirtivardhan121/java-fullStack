package com.ustglobal.objectclass;

public class TestB {

	public static void main(String[] args) {
		
		HashCode p =  new HashCode();
		int pHashCode = p.hashCode();
		System.out.println("Hash code of p is " +pHashCode);
		
		HashCode q = new HashCode();
		int qHashCode =  q.hashCode();
		System.out.println("Hash code of q is " +qHashCode);
	}
}
