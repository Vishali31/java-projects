package com.Main;

import java.util.ArrayList;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		TreeSet subjects = new TreeSet();
		subjects.add("sql");
		subjects.add("HTML");
		subjects.add("CSS");
		subjects.add("javascript");
		subjects.add("os");
		System.out.println("size of :" +subjects.size());
		System.out.println(subjects);
		
		subjects.add("CSS");
		subjects.add("git");
		System.out.println("size of :" +subjects.size());
		System.out.println(subjects);

	}

}
