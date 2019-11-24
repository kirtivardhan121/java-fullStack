package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<>();
		lh.put("Bangalore", 560068);
		lh.put("Pune", 451076);
		lh.put("Mumbai", 467844);
		
		for(Map.Entry<String, Integer> m : lh.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("Key is " +key+ "-----" + "Value is " +value);
			
			System.out.println("==========================");
			
			
		}
	}
}
