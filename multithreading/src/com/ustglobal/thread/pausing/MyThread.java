package com.ustglobal.thread.pausing;

public class MyThread extends Thread {

	@Override
	public void run() {
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("Child Thread");
			Thread.yield();
			/*yield() method pause the execution of current thread and gives opportunity to the heigher 
			or same priority thread*/
		}
	}
}
