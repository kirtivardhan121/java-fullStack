package com.ustglobal.phoneapp;

import java.util.Scanner;

import com.ustglobal.phoneapp.dao.PhoneDAOImpl;

public class PhoneApp {
public static void main(String[] args) {
	for(;;) {
		System.out.println("press 1 to show all the Contacts");
		System.out.println("press 2 to search for Contacts");
		System.out.println("press 3 to opearte on Contcts");
		try{
			Scanner sc=new Scanner(System.in);
			int ch=sc.nextInt();
			
			PhoneDAOImpl dao=new PhoneDAOImpl();
			switch (ch) {
			case 1:
				dao.showAllContacts();
				break;
			case 2:
				System.out.println("Enter Name to search");
				String name=sc.next();
				dao.searchContacts(name);
				break;
			case 3:
				dao.operateOnContacts();
			default:
				break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
}
