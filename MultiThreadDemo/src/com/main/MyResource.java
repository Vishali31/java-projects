package com.main;

import java.util.ArrayList;
import java.util.List;

public class MyResource {
	
	private List<String> courses;
	public MyResource() {
		courses = new ArrayList<>();
		courses.add("java");
		courses.add("sql");
		courses.add("c");
		courses.add("c++");
		courses.add("Html");
		
		
	}
synchronized void display() {
	courses.forEach(c->System.out.println(Thread.currentThread().getName()+" :"+c));
}
}
 