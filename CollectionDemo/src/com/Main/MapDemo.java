package com.Main;

import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
	
		
		TreeMap <String,String> capitalsmap = new TreeMap<>();
		capitalsmap.put("India", "Delhi");
		capitalsmap.put("france", "paris");
		capitalsmap.put("uk", "londan");
		
		
		System.out.println(capitalsmap);
		 String countryName = "karur";
		  
		 
		 String capital = capitalsmap.get(countryName);
		 if(capital!=null) {
			 System.out.println(capital);
			
			 
		 }
		 else {
			 System.out.println("Not existing in map");
		 }
		 
		
	}

}
