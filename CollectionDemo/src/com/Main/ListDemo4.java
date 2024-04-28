package com.Main;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo4 {

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
	
	}

}
