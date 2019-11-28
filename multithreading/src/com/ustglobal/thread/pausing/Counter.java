package com.ustglobal.thread.pausing;

public class Counter {

	int v;
	
	synchronized public void increament() {
		v++;
	}
	
	synchronized public void decreament() {
		v--;
	}
	
	synchronized public void showValue() {
		System.out.println("V value is : " +v);
	}
}

//Race condition :- Multiple thread accessing same resource is called race condition.
//We can overcome by using synchronized  method.
//Thread safe:- It will not allow other thread to access the resource until current thread gets executed.