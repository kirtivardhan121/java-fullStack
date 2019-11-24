package com.ustglobal.objectclass;

public class TestG {

	public static void main(String[] args) {

		Emp e1 = new Emp(101, "Vardhan", 100000.90);
		Emp e2 = new Emp(102, "Kirti", 500000.98);
		Emp e3 = new Emp(102, "Kirti", 500000.98);

		boolean isEqual = e1.equals(e2);
		System.out.println(e2.equals(e3));
		System.out.println(e1.equals(e3));
		System.out.println(isEqual);

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

	}
}
