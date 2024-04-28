package com.java8;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {

	public static void main(String[] args) {
		
		 ArrayList <String> names = new ArrayList<>();
	        names .add("sql");
	        names .add("HTML");
	        names .add("CSS");
	        names .add("javascript");
	        names .add("os");
	        Iterator<String> i = names.iterator();
	        while(i.hasNext()) {
	        	System.out.println(i.next());
	        }
		
			names.forEach(c->System.out.println(c));
	}

}
