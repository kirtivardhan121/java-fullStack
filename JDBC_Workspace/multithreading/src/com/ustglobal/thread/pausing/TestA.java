package com.ustglobal.thread.pausing;

public class TestA {

	public static void main(String[] args) {


		Object obj1 = new Object();
		Object obj2 = new Object();

		
		
		Runnable r1 = () -> {

			synchronized (obj1) {
				System.out.println("T1 Started");
				System.out.println("T1 has Locked");

				try {
					
					obj1.wait();
				
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				
				synchronized (obj2) {
					System.out.println("T1 has locked obj2");
				}
			}
			System.out.println("T1 finished");
		};

		Runnable r2 = () -> {
			synchronized (obj2) {
				System.out.println("T2 Started");
				System.out.println("T2 has locked obj2");

				synchronized (obj1) {
					System.out.println("T2 has locked obj1");
					obj1.notify();
				}
			}
			System.out.println("T2 finished");
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
	}
}

/*Deadlock one thread try to access object which is locked by another thread.
*Wait() method is used to overcome the deadlock situation.
*wait() method pauses current thread and release the object. 
*notify() method notifies the thread that is waiting for that object.
*notifyAll() method notifies all the thread those are waiting for that object.
*
*/