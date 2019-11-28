package com.ustglobal.thread.properties;

public class MyIdThread extends Thread{

	public static void main(String[] args) {

		System.out.println("Main Started");

		System.out.println(Thread.currentThread().getId());

		MyIdThread mi = new MyIdThread();
		System.out.println("Myid Thread: " +mi.getId());

		System.out.println("priority " +Thread.currentThread().getPriority());

		/*Thread.currentThread().setPriority(19);
		 *we can not set the priority higher than 10 otherwise we'll get IllegalArgumentException
		 */

		System.out.println("Main Ended");
	}
}
