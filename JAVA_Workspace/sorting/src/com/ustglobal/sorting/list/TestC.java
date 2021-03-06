package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestC {

	public static void main(String[] args) {

		LinkedList<Integer> l = new LinkedList<>();

		l.add(22);
		l.add(40);
		l.add(12);
		l.add(10);
		l.add(80);

		Integer peekElement = l.peek();
		System.out.println("Peek Element " +peekElement);
		Integer peekFirstElement = l.peekFirst();
		System.out.println("Peek First Element " +peekFirstElement);
		Integer peekLastElement = l.peekLast();
		System.out.println("Peek Last element " +peekLastElement);
		System.out.println("After Peek " +l);
		
		System.out.println("-------------------------------");

		Integer pollElement = l.poll();
		System.out.println("Poll Element " +pollElement);
		Integer pollFirstElement = l.pollFirst();
		System.out.println("Pool First Element " +pollFirstElement);
		Integer pollLastElement = l.pollLast();
		System.out.println("Pool Last element " +pollLastElement);
		System.out.println("After Pool " +l);
		
		System.out.println("-------------------------------");
		
		l.push(12);
		System.out.println("After Push " +l);
		Integer p  = l.pop();
		System.out.println(p);
		System.out.println("After pop " +p);
	}
}
