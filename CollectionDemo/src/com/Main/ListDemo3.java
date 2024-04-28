package com.Main;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo3 {

	public static void main(String[] args) {
		ArrayList subjects = new ArrayList();
		subjects.add("sql");
		subjects.add("HTML");
		subjects.add("CSS");
		subjects.add("javascript");
		subjects.add("os");
		System.out.println(subjects);
		System.out.println("Using iterator.......");
		
		
		
		Iterator i =subjects. iterator();
		while (i.hasNext()) {
			String str = (String) i.next();
			System.out.println(str);
		}
		System.out.println("Using enhancedfor loop");
		for( Object obj:subjects) {
			String str = (String) obj;
			System.out.println(str);
			
		}
			

	}

}
