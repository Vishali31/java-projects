package com.Main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ListDemo5 {

	public static void main(String[] args) {
		
		
		ArrayList <Integer> subjects = new ArrayList<>();
		subjects.add(34);
		subjects.add(56);
		subjects.add(85);
		subjects.add(45);
        subjects.add(90);
        
        
        Iterator<Integer> g = subjects.iterator();
        while(g.hasNext()) {
        	System.out.println(g.next());
        }
	
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
	
        
        HashSet <Double> set = new HashSet<>();
        set.add(34.0);
        set.add(78.0);
        set.add(39.0);
        
        Iterator<Double> s = set.iterator();
        while(s.hasNext()) {
        	System.out.println(s.next());
        }
	
	}
}
