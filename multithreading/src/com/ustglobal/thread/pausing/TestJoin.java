package com.ustglobal.thread.pausing;

public class TestJoin {

	public static void main(String[] args) {

		System.out.println("Main Started");

		MyJoinThread t = new MyJoinThread();

		t.start();

		try {

			t.join(10000);

			/*join() method pause the execution of the current thread an
			for execution of other thread and wait for the time to finish the execution.
			 */
		} catch (InterruptedException e) {

			e.printStackTrace();

		}

		for(int i = 0 ; i<5; i++) {
			System.out.println("Main thread");
		}

		System.out.println("Main Ended");
	}
}
