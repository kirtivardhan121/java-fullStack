package com.ustglobal.thread.properties;

public class MyPriorityThread extends Thread{

	public static void main(String[] args) {

		System.out.println("Main Started");
		int p = Thread.currentThread().getPriority();
		System.out.println("main Thread Priority: " +p);

		Thread.currentThread().setPriority(7);
		System.out.println("main thread priority: " +Thread.currentThread().getPriority());

		/*Default priority for main is 5
		 *By default Child thread priority is same as parent thread priority
		 *But we can change the child thread priority by setPriority() method
		 */
		
		MyPriorityThread t = new MyPriorityThread();
		int q = t.getPriority();
		System.out.println("MyPriorityThread priority: " +q);
		
		t.setPriority(6);
		System.out.println("MyPriorityThread priority: " +t.getPriority());

		System.out.println("Main Ended");
	}
}
