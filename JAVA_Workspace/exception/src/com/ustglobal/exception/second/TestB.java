package com.ustglobal.exception.second;

import java.io.IOException;
import java.sql.SQLException;

public class TestB {

	public static void main(String[] args) {

		System.out.println("Main Started");

		FileTest ft = new FileTest();

		try {
			try {
				try {
					ft.open();
				} catch (ClassNotFoundException ce) {

					ce.printStackTrace();
				}
			} catch (IOException ie) {

				ie.printStackTrace();
			}
		} catch (SQLException se) {

			se.printStackTrace();
		}
	}

}
 