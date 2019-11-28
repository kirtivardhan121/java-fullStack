package com.ustglobal.thread.properties;

public class MyThread extends Thread{

	public static void main(String[] args) {
		
		System.out.println("Main Started");
		
		String tname= Thread.currentThread().getName();
		System.out.println("Current Thread : " +tname);
		
		MyThread t = new MyThread();
		String mname = t.getName();
		System.out.println("MyThread Name : " +mname);
		
		Thread.currentThread().setName("Bala");
		
		t.setName("Vardhan");
		System.out.println("MyThread Name : " +t.getName());
		
		System.out.println(10/0);
		
		System.out.println("Main Ended");
	}
}
