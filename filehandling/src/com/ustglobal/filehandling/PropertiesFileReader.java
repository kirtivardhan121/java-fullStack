package com.ustglobal.filehandling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesFileReader {

	public static void main(String[] args) {
		
		String path = "db.properties";
		
		FileReader reader = null;
		
		try {
			
			reader = new FileReader(path);
			Properties pro = new Properties();
			pro.load(reader);
			String url = pro.getProperty("url");
			String user = pro.getProperty("user");
			String password = pro.getProperty("password");
			
			System.out.println("URL: " +url);
			System.out.println("User: " +user);
			System.out.println("Password: " +password);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
