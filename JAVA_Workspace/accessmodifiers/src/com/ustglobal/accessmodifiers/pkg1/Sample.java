package com.ustglobal.accessmodifiers.pkg1;

import com.ustglobal.accessmodifiers.pkg2.Demo;

public class Sample extends Demo{


	public static void main(String[] args) {
		Demo d = new Demo();
		
		Sample s = new Sample();
		/*System.out.println(d.a);
		*d.add();
		*Not Possible*/
		
//		Default can not accessible in different package
		/*System.out.println(d.b);
		d.sub();*/
		
//		Protected
		System.out.println(s.c);
		s.mul();
		
//		Public
		System.out.println(d.name);
		d.div();
	}
}
