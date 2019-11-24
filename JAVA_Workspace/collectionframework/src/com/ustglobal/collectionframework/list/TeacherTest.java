package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TeacherTest {

	public static void main(String[] args) {

		ArrayList<Teacher> al = new ArrayList<Teacher>();

		Teacher t1 = new Teacher(101, "Kirtivardhan" , "COA" , 5400000);
		Teacher t2 = new Teacher(102, "Rajvardhan" , "DELD" , 5400000);
		Teacher t3 = new Teacher(103, "Harshvardhan" , "DSA" , 5400000);
		Teacher t4 = new Teacher(104, "Yashvardhan" , "IOT" , 5400000);
		Teacher t5 = new Teacher(105, "Shwetvardhan" , "ISEE" , 5400000);

		al.add(t1);
		al.add(t2);
		al.add(t3);
		al.add(t4);
		al.add(t5);

		for(int i = 0 ; i< al.size() ; i++) {
			Teacher t = al.get(i);
			System.out.println("Teacher's id " +t.id);
			System.out.println("Name of the Teacher is " +t.name);
			System.out.println("Subject Thought " +t.subject);
			System.out.println("Salary is " +t.salary);
		}

		System.out.println("========= for each ==================");

		for(Teacher te : al ) {
			System.out.println(te);
		}
	}

}
