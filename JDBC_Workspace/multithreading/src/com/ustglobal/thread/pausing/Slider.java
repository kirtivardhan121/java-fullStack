package com.ustglobal.thread.pausing;

public class Slider {

	public static void main(String[] args) {

		System.out.println("Main Started");

		for(int i = 0; i < 5 ; i++) {
			System.out.println("Sliding");

			try {

				Thread.sleep(2000);
				
				//sleep() method pauses the execution of current thread. 

			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

		System.out.println("main ended");
	}
}
