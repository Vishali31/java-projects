package com.Main;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList subjects = new ArrayList();
		subjects.add("sql");
		subjects.add("HTML");
		subjects.add("CSS");
		subjects.add("javascript");
		subjects.add("os");
		System.out.println("size of :" +subjects.size());
		System.out.println(subjects);
		
		subjects.add("CSS");
		subjects.add(2,"git");
		System.out.println("size of :" +subjects.size());
		System.out.println(subjects);
			
		}

	}


