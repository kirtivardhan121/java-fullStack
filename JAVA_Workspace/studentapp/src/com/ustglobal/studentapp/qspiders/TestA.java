package com.ustglobal.studentapp.qspiders;

//import com.ustglobal.studentapp.jspiders.Angular;
//import com.ustglobal.studentapp.jspiders.React;

import com.ustglobal.studentapp.jspiders.*;

public class TestA {

	public static void main(String[] args) {
		QTP q = new QTP();
		q.teachQTP();
		
		System.out.println("-------------------");
		
		Selenium s = new Selenium();
		s.teachSelenium();
		
		System.out.println("-------------------");
		
		
//		com.ustglobal.studentapp.jspiders.Angular a1 = new com.ustglobal.studentapp.jspiders.Angular();
		
		Angular a = new Angular();
		a.teachAngular();
		
		System.out.println("-------------------");
		
		React r = new React();
		r.teachReact();
		
		System.out.println("-------------------");	
	}

}
