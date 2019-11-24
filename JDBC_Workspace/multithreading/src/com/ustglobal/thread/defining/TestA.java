package com.ustglobal.thread.defining;

public class TestA {

	public static void main(String[] args) {

		System.out.println("Main Started");

		MyThread t = new MyThread();
		t.start();

		//		t.run();
		
		/*
		 *we should not call run() method , it behaves like normal  program.
		 *All code will execute inside main thread only.
		 *we can not call start() method again, it will throw IllegalThreadStateException.
		 */

		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("Main thread");
		}

		System.out.println("Main Ended");
	}
}
